package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/test3/{fruit}/{flower}")
	public String rest_test(@PathVariable String fruit,
						    @PathVariable String flower,
						    Model model) {
		model.addAttribute("fruit",fruit);
		model.addAttribute("flower",flower);
		return "test4";
	}
	
	
	@RequestMapping("/multiple")
	public String multiple() {
		System.out.println("multiple called");
		return "multiple";
	}
	
	@RequestMapping("/checkUser2/{Dan}")
	public String checkUser2(@PathVariable String Dan,Model model) {
	//public String checkUser2(HttpServletRequest req,Model model)
//		System.out.println("checkUser2 called");
//		String Dan = req.getParameter("dan");
		String result = " ";
		for(int i=Integer.parseInt(Dan); i==Integer.parseInt(Dan); i++) {
			if(i<2 || i>9) {
				return "redirect:/multiple";
			}
			for(int j=1; j<=9; j++) {
				result = result+"<br>"+(i+"x"+j+"="+(i*j))+"<br>";
				}
		};
		model.addAttribute("DAN",Dan);
		model.addAttribute("Result",result);
		System.out.println(Dan);
		System.out.println(result);
		
		return "multipleinfo";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("login called");
		return "login";
	}
	@RequestMapping("/checkUser")
	public String checkUser(HttpServletRequest req,Model model) {
		                                     //변수명
		
		String loginId = req.getParameter("Loginid");
		        //login.jsp에서 input태그 안의 name=Loginid
		System.out.println(loginId);
		String pw = req.getParameter("passcode");
		System.out.println(pw);
		//login.jsp에서 input태그 안의 name=passcode
//	public String checkUser(Member member,Model model) {
//		String loginId = member.getLoginid();
//		String pw = member.getPasscode();
//		        
		if(!(loginId.equals("munhui3078")) || !(pw.equals("jmh82803078"))) {
			//java에서 문자열이 같은지 확인할때는 .equals를 써야함. 같지 않아야 할때는 앞에 !붙이기
			return "redirect:/login";
		}
		model.addAttribute("loginid",loginId);
		                   //변수 이름,//위의 String loginId 
		model.addAttribute("passcode",pw);
		                   //변수 이름,//위의 String pw
		return "logininfo";
	}
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "JSP in Gradle"; //문자열 자체 출력
	}
	
	@RequestMapping("/test1")  //localhost:8081/test1 =>url경로
	public String test1(Model model) {    
		//Model 객체를 통해 view로 data 전달
		//데이터만 설정 가능
		model.addAttribute("name","정문희");
		model.addAttribute("gender","female");
		model.addAttribute("age","24");
		return "test1";        //실제 호출될 /WEB-INF/views/test1.jsp
		//=>"test1" => 출력될 파일 이름
	}
	
	@RequestMapping("/test2")  //localhost:8081/test2
	public ModelAndView test2() {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Grape");
		list.add("Peach");
		
		mv.addObject("lists",list);
		mv.addObject("names","사과,포도,복숭아");
		mv.setViewName("sub/test2");
		return mv;    //실제 호출될 /WEB-INF/views/sub/test2.jsp
	}
	
	@RequestMapping("/mt")
	public String mt() {
		return "sub/mt";
	}

}
