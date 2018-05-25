package com.ju.japro.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;

public class ZipUtil {
	
	public static void main(String[] args) {
		String unzipdir = "D:\\test2";  
        String unzipfile = "D:\\add_int_int.zip";  
        unzip(unzipfile, unzipdir);  
	}
	
	public static void unzip(String zipFilePath,String saveFileDir) {
		if(!saveFileDir.endsWith("\\") && !saveFileDir.endsWith("/") ){  
            saveFileDir += File.separator;  
        }  
        File dir = new File(saveFileDir);  
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
        File file = new File(zipFilePath);  
        if (file.exists()) {  
        	
        	InputStream is = null;   
            ZipArchiveInputStream zais = null;  
            try {  
                is = new FileInputStream(file);  
                zais = new ZipArchiveInputStream(is);  
                ArchiveEntry archiveEntry = null;  
                while ((archiveEntry = zais.getNextEntry()) != null) {   
                    // 获取文件名  
                    String entryFileName = archiveEntry.getName();  
                    // 构造解压出来的文件存放路径  
                    String entryFilePath = saveFileDir + entryFileName;  
                    OutputStream os = null;  
                    try {  
                        // 把解压出来的文件写到指定路径  
                        File entryFile = new File(entryFilePath);  
                        if(entryFileName.endsWith("/")){  
                            entryFile.mkdirs();  
                        }else{  
                            os = new BufferedOutputStream(new FileOutputStream(  
                                    entryFile));                              
                            byte[] buffer = new byte[1024 ];   
                            int len = -1;   
                            while((len = zais.read(buffer)) != -1) {  
                                os.write(buffer, 0, len);   
                            }  
                        }  
                    } catch (IOException e) {  
                        throw new IOException(e);  
                    } finally {  
                        if (os != null) {  
                            os.flush();  
                            os.close();  
                        }  
                    }  
  
                }   
            } catch (Exception e) {  
                throw new RuntimeException(e);  
            } finally {  
                try {  
                    if (zais != null) {  
                        zais.close();  
                    }  
                    if (is != null) {  
                        is.close();  
                    }  
                } catch (IOException e) {  
                    throw new RuntimeException(e);  
                }  
            }  
        }  
	}
}