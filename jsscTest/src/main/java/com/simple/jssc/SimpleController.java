package com.simple.jssc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class SimpleController {
 
	@Autowired
	private JsscComponent jsscComponent;
	
 	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
 		
 		return "/index";
	}

 	@RequestMapping(value = "connect", method = RequestMethod.GET)
 	public String connect(Model model, HttpServletRequest request) throws Exception {

 		String status = jsscComponent.readStr();
 		
 		//시리얼 출력 전달 
 		model.addAttribute("temperature", status);
 		
 		String str  = request.getParameter("str");
 		
 		str = str == null ? "0" : str;
 		
 		jsscComponent.writeStr(str);
 		
 		
 		return "/connect";
 	}

 	





}
