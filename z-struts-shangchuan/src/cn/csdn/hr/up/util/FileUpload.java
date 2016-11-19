package cn.csdn.hr.up.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class FileUpload {
	
	public static boolean upload(File upload,String uploadContentType, String uploadFileName) {
		 //声明文件上传的路径  一般放入服务器中，这是在磁盘下
    	String path = "F:\\develop\\upload\\upload\\";
    	/*通常一般放在
    	 *String path = ServletActionContext.getServletContext().getRealPath("/upload");  
    	 * 
    	 * */
    	
       //根据路径名创建一个文件  
         File file = new File(path);  
  
         //判断file是否存在，如果不存在，则自动创建一个  
  
         if(!file.exists()){  
         file.mkdirs();  
        }  
         
         //将上传的文件进行从新命名
         uploadFileName = UUID.randomUUID() + uploadFileName.substring(uploadFileName.indexOf("."));
         System.out.println(uploadFileName+"<==");
         //将上传文件放入到新的目录下
         try {
			FileUtils.copyFile(upload, new File(file, uploadFileName));
			return true;
		} catch (IOException e) {
			e.printStackTrace();	
			return false;
		}  
	
	}
	
	
	

}
