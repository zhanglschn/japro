package com.ju.japro.structalg.six.proxy;

import java.io.File;
import java.lang.reflect.Constructor;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

import com.ju.japro.common.util.Print;

public class Proxy {
	private static final String RT = "\r\n";
	
	
	public static Object newProxyInstance() throws Exception{
		//声明一段源码  
        String sourceCode =  
        "package com.ju.japro.structalg.six.proxy;"+ RT +  
        "import com.ju.japro.structalg.six.proxy.Admin;" + RT +  
        "import com.ju.japro.structalg.six.proxy.Manager;" + RT +  
        "//以聚合方式实现的代理主题" + RT +  
        "public class $Proxy0 implements Manager{" + RT +  
        "   private Admin admin;" + RT +  
        "   public $Proxy0(Admin admin) {" + RT +  
        "       super();" + RT +  
        "       this.admin= admin;" + RT +  
        "   }" + RT +  
        "   public void doSomething() {" + RT +  
        "       System.out.println(\"Log:admin操作开始\");" + RT +  
        "       admin.doSomething();" + RT +  
        "       System.out.println(\"Log:admin操作结束\");" + RT +  
        "   }" + RT +  
        "}";  
        
        String fileName = System.getProperty("user.dir") + "/src/com/ju/japro/structalg/six/proxy/$Proxy0.java";
        Print.print(fileName);
        //使用org.apache.commons.io.FileUtils.writeStringToFile()将源码写入磁盘  
        File file = new File(fileName);
        FileUtils.writeStringToFile(file,sourceCode);
        
        // 获取当前系统中的编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        
        //获取文件管理者
        StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
        
        Iterable its = fileMgr.getJavaFileObjects(fileName);
        //编译任务
        CompilationTask task = compiler.getTask(null,fileMgr,null,null,null,its);
        //开始编译，执行完可在当前目录下看到.class文件
        task.call();
        fileMgr.close();
        //load到内存
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class cls = loader.loadClass("com.ju.japro.structalg.six.proxy.$Proxy0");
        //生成代理类对象
        Constructor ct = cls.getConstructor(Admin.class);
        return ct.newInstance(new Admin());
	}
	
	public static void main(String[] args) throws Exception{
		Manager m = (Manager)Proxy.newProxyInstance();  
        m.doSomething();  
	}
	
}