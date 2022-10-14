package com.study.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "ValidationUtils (4)";
	}
	@RequestMapping("/insertForm")
	public String insert1() {
		return "createPage";
	}
	@RequestMapping("/create")
	public String insert2(@ModelAttribute("dto") @Valid ContentDto contentDto, 
			              BindingResult result) 
	{
		String page = "createDonePage"; //성공하면 표시될 JSP 파일이름.
		System.out.println(contentDto);
		
		//ContentValidator 호출
//		ContentValidator validator = new ContentValidator();
//		validator.validate(contentDto, result);
		if(result.hasErrors()) {
			System.out.println("getAllErros : "+result.getAllErrors());
			
//			if (result.getFieldError("writer") != null) {
//				System.out.println("1:"+result.getFieldError("writer").getCode());
//			}
//			if (result.getFieldError("content") != null) {
//				System.out.println("2:"+result.getFieldError("content").getCode());
//			}
			String errmsg="";
			if (result.getFieldError("writer") != null) {
				System.out.println("1:"+result.getFieldError("writer").getDefaultMessage());
				errmsg+=result.getFieldError("writer").getDefaultMessage();
			}
			if (result.getFieldError("content") != null) {
				System.out.println("2:"+result.getFieldError("content").getDefaultMessage());
				errmsg+=result.getFieldError("content").getDefaultMessage();
			}
			contentDto.setError_message(errmsg);
			page="createPage";
			
		}
		
		return page;
	}
}
