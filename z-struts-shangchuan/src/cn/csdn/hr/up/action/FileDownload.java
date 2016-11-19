package cn.csdn.hr.up.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

//文件下载
public class FileDownload extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//接收文件名
	private String fileName;
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	//返回一个输入流，作为一个客户端来说是一个输入流，但对于服务器端是一个 输出流、
	//、、必须与  <param name="inputName">downloadFile</param>get方法名相同
	public InputStream getDownloadFile() throws Exception
	{
		/*	F:/develop/upload/upload
		 * 返回服务器下目录文件的流
			return ServletActionContext.getServletContext().getResourceAsStream("upload/"+fileName);
		 * 
		 * */	
		/* 
		  ** */
//		此方法为自己设置的路径获取磁盘下F:\\develop\\upload\\upload 目录下的文件
		InputStream ins = new FileInputStream(new File("F:\\develop\\upload\\upload\\"+fileName));;
		return ins;
	  
	}
	
	public String execute() throws Exception {
		
		return SUCCESS;
	}

}
