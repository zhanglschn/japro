package com.ju.japro.structalg.six.proxy;
import com.ju.japro.structalg.six.proxy.Admin;
import com.ju.japro.structalg.six.proxy.Manager;
//以聚合方式实现的代理主题
public class $Proxy0 implements Manager{
   private Admin admin;
   public $Proxy0(Admin admin) {
       super();
       this.admin= admin;
   }
   public void doSomething() {
       System.out.println("Log:admin操作开始");
       admin.doSomething();
       System.out.println("Log:admin操作结束");
   }
}