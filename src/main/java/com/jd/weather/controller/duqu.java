package com.jd.weather.controller;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.portable.OutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class duqu {
	@RequestMapping(value={"img/main"})
	public void getRainImage(HttpServletResponse response){
	response.setContentType("Image/gif");	
	File file=new File("C"+File.separator+"rain.jpg");
	FileInputStream  fis=null;
	OutputStream output=null;
	
		
	}
	
}
