package cn.csdn.hr.up.action;  
  
import java.io.File;

import cn.csdn.hr.up.util.FileUpload;

import com.opensymphony.xwork2.ActionSupport;
	  
	public class UploadAction extends ActionSupport{  
	  
	    private static final long serialVersionUID = 1L;  
	  
	    private File upload;  
	  
	  
	    private String uploadContentType;  
	  
	  
	    private String uploadFileName;  
	  
	    public File getUpload() {  
	  
	       return upload;  
	  
	    }  
	  
	    public void setUpload(File upload) {  
	  
	       this.upload = upload;  
	  
	    }  
	  
	    public String getUploadContentType() {  
	  
	       return uploadContentType;  
	  
	    }  
	  
	    public void setUploadContentType(String uploadContentType) {  
	  
	       this.uploadContentType = uploadContentType;  
	  
	    }  
	  
	    public String getUploadFileName() {  
	  
	       return uploadFileName;  
	  
	    }  
	  
	    public void setUploadFileName(String uploadFileName) {  
	  
	       this.uploadFileName = uploadFileName;  
	  
	    }  
	  
	    @Override  
	  
	    public String execute() throws Exception {  
		  if(upload != null)
		    	FileUpload.upload(upload,uploadContentType,uploadFileName);
		  else 
		  return ERROR;
		  
	      return SUCCESS;  
	  
	    }  
	}  
