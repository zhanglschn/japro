package com.ju.japro.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;


public class FileOper {
	public static void unZipFiles(File zipFile,String descDir) throws IOException {
		
		Charset gbk = Charset.forName("GBK");
		ZipFile zip = new ZipFile(zipFile,gbk);
		String name = zip.getName().substring(zip.getName().lastIndexOf('\\')+1, zip.getName().lastIndexOf('.'));
		
		File pathFile = new File(descDir + name);
		
		if (!pathFile.exists()) {
			pathFile.mkdir();
		}
		
		for (Enumeration<? extends ZipEntry> entries = zip.entries(); entries.hasMoreElements();) {
			ZipEntry entry = (ZipEntry) entries.nextElement();
			String zipEntryName = entry.getName();
			InputStream in = zip.getInputStream(entry);
			
			String outPath = (descDir + name + "/" + zipEntryName).replaceAll("\\*", "/");
			
			// 判断路径是否存在，不存在则创建文件路径
			File file = new File(outPath.substring(0,outPath.lastIndexOf("/")));
			
			if (!file.exists()) {
				file.mkdir();
			}
			
			if (new File(outPath).isDirectory()) {
				continue;
			}
			
			FileOutputStream out = new FileOutputStream(outPath);
			byte[] buf1 = new byte[1024];
			int len;
			while ((len = in.read(buf1)) > 0) {
				out.write(buf1,0,len);
			}
			in.close();
			out.close();
		}
		return;
	}
	
	
	
	 /** 
     * 将要读取文件头信息的文件的byte数组转换成string类型表示 
     *  
     * @param src 
     *            要读取文件头信息的文件的byte数组 
     * @return 文件头信息 
     */  
    private static String bytesToHexString(byte[] src) {  
        StringBuilder builder = new StringBuilder();  
        if (src == null || src.length <= 0) {  
            return null;  
        }  
        String hv;  
        for (int i = 0; i < src.length; i++) {  
            // 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式，并转换为大写  
            hv = Integer.toHexString(src[i] & 0xFF).toUpperCase();  
            if (hv.length() < 2) {  
                builder.append(0);  
            }  
            builder.append(hv);  
        }  
        return builder.toString();  
    } 
	
	public static void unZipFiles(byte[] data) throws Exception {
		
//		byte[] b2 = new byte[4];  
		byte[] b3 = {82,97,114,33};  	
		
		
//		System.arraycopy(data, 0, b2, 0, 4); 
//		System.out.println(bytesToHexString(b2));
		System.out.println(bytesToHexString(b3));  
		Charset gbk = Charset.forName("GBK");
		
		InputStream bais = new ByteArrayInputStream(data);
		ZipInputStream zis = new ZipInputStream(bais,StandardCharsets.ISO_8859_1);
//		ZipInputStream zis = new ZipInputStream(bais,gbk);
		
		
		
		File pathFile = new File(System.getProperty("user.dir") + File.separator + "zipTmp" +  File.separator + "123456798");
		
		if(!pathFile.getParentFile().exists()) {  
            //如果目标文件所在的目录不存在，则创建父目录  
            System.out.println("目标文件所在目录不存在，准备创建它！");  
            if(!pathFile.getParentFile().mkdirs()) {  
                System.out.println("创建目标文件所在目录失败！");  
                return;  
            }  
        }  
		
		if (!pathFile.exists()) {
			pathFile.mkdir();
		}
		ZipEntry entry = null;
		while ((entry = zis.getNextEntry()) != null) {
			String zipEntryName = entry.getName();
			
			byte[] b = zipEntryName.getBytes("ISO_8859_1");  
			
			zipEntryName = new String(b,"GBK");  
			
			String outPath = (System.getProperty("user.dir") + File.separator + "zipTmp" +  File.separator + "123456798" +  File.separator + zipEntryName).replaceAll("\\*", "/");
			// 判断路径是否存在，不存在则创建文件路径
			File file = new File(outPath.substring(0,outPath.lastIndexOf("/")));
			
			if (!file.exists()) {
				file.mkdir();
			}
			
			if (new File(outPath).isDirectory()) {
				continue;
			}
			System.out.println(outPath);
			
			FileOutputStream fileOutputStream = new FileOutputStream(outPath);
			byte[] buf = new byte[1024];
			int len = -1;
			while ((len = zis.read(buf)) != -1) {
				fileOutputStream.write(buf,0,len);
			}
			
			fileOutputStream.flush();
			fileOutputStream.close();
			
			zis.closeEntry();
		}
		
		zis.close();
		return;
	}
	
	
	public static List<File> getFiles(String path){
	    File root = new File(path);
	    List<File> files = new ArrayList<File>();
	    if(!root.isDirectory()){
	        files.add(root);
	    }else{
	        File[] subFiles = root.listFiles();
	        for(File f : subFiles){
	            files.addAll(getFiles(f.getAbsolutePath()));
	        }    
	    }
	    return files;
	}
	
	
	public static byte[] InputStream2ByteArray(String filePath) throws IOException {
	    InputStream in = new FileInputStream(filePath);
	    byte[] data = toByteArray(in);
	    in.close();
	    return data;
	}
	
	public static byte[] toByteArray(InputStream in) throws IOException {
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    byte[] buffer = new byte[1024 * 4];
	    int n = 0;
	    while ((n = in.read(buffer)) != -1) {
	        out.write(buffer, 0, n);
	    }
	    return out.toByteArray();
	}
	
	public static void main(String[] args) {
		try {  
			unZipFiles(InputStream2ByteArray("D:\\add_int_int.zip"));
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
}