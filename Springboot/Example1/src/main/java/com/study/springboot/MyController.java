package com.study.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String root() {
		return "login";
	}

	@RequestMapping("/num1")
	public String num1(HttpServletRequest req) {
		HttpSession session = req.getSession();
		if(session.getAttribute("userID")==null) {
			return "redirect:/signOn";
		}
		return "loginForm";
	}

	@RequestMapping("/dologin")
	public String num2(HttpServletRequest req, Model model) {
		String loginId = req.getParameter("Id");
		String pw = req.getParameter("passcode");
		model.addAttribute("loginID",loginId);
		HttpSession session = req.getSession();
		if ((loginId.equals(session.getAttribute("userID")) && (pw.equals(session.getAttribute("pw"))))) {
			return "loginOK";
		} else {
			return "redirect:/num1"; // redirect는 경로를 적어줘야함 /return은 JSP파일이름
		}
		

	}

	@RequestMapping("/signOn")
	public String signon() {
		return "signOn";
	}

	@RequestMapping("/register")
	public String num3(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String newId = req.getParameter("newId");
		String Npasscode = req.getParameter("Npasscode");
		String N1passcode = req.getParameter("N1passcode");
		if (!(Npasscode.equals(N1passcode))) {
			model.addAttribute("name", name);
			model.addAttribute("mobile", mobile);
			model.addAttribute("newId", newId);
			return "signOn";
		}
		session.setAttribute("userID", newId);
		session.setAttribute("pw", N1passcode);

		model.addAttribute("name", name);
		model.addAttribute("mobile", mobile);
		model.addAttribute("newId", newId);
		model.addAttribute("N1passcode", N1passcode);

		return "register";
	}

	@RequestMapping("/num4")
	public String num4() {
		return "loginForm";
	}
}
