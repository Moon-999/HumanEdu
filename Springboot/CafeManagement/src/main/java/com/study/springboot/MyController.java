package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.CafeDTO;
import com.study.springboot.jdbc.OrderDTO;
import com.study.springboot.jdbc.iCafe;
import com.study.springboot.jdbc.iOrder;

@Controller
public class MyController {
	@Autowired
	private iCafe cafe;
	@Autowired
	private iOrder order;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "CafeManagement";
	}
	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}
	@RequestMapping("/order")
	public String order() {
		return "order";
	}
	@RequestMapping("/sales")
	public String sales() {
		return "sales";
	}
	@RequestMapping("/loadMenu")
	@ResponseBody 
	public String doLoadMenu() {
		ArrayList<CafeDTO> cdto = cafe.loadMenu();
		JSONArray ja = new JSONArray();
		for(int i=0; i<cdto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("id",cdto.get(i).getId());
			jo.put("name",cdto.get(i).getName());
			jo.put("price",cdto.get(i).getPrice());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	@RequestMapping("/addMenu")
	@ResponseBody
	public String doAddMenu(HttpServletRequest req) {
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		cafe.addMenu(name, price);
		return "ok";
	}
	@RequestMapping("/deleteMenu")
	@ResponseBody
	public String doDeleteMenu(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		cafe.deleteMenu(id);
		return "ok";
	}
	@RequestMapping("/updateMenu")
	@ResponseBody
	public String doUpdateMenu(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id")); 
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		cafe.updateMenu(id, name, price);
		return "ok";
	}
	
	@RequestMapping("/addOrder")
	@ResponseBody
	public String addOrder(HttpServletRequest req) {
		//order.addOrder(req.getParameter("mobile"),
		//				 req.getParameter("name"),
		//				 Integer.parseInt(req.getParameter("qty")),
		// 				 Integer.parseInt(req.getParameter("price")));
		String mobile = req.getParameter("mobile");
		String menu = req.getParameter("name");
		int qty = Integer.parseInt(req.getParameter("qty"));
		int price = Integer.parseInt(req.getParameter("price"));
		order.addOrder(mobile, menu, qty, price);
		return "ok";
		
	}
//  @RequestMapping("/loadOrder")
//	@ResponseBody 
//	public String doLoadOrder() {
//		ArrayList<OrderDTO> odto = order.loadOrder();
//		JSONArray ja = new JSONArray();
//		for(int i=0; i<odto.size(); i++) {
//			JSONObject jo = new JSONObject();
//			jo.put("menu",odto.get(i).getMenu());
//			jo.put("qty",odto.get(i).getQty());
//			jo.put("price",odto.get(i).getPrice());
//			jo.put("created",odto.get(i).getCreated());
//			ja.add(jo);
//		}
//		return ja.toJSONString();
//	}
	
	@RequestMapping("/getSalesList")
	@ResponseBody
	public String getSalesList(HttpServletRequest req) {
		System.out.println("getSalesList");
		String start1 = req.getParameter("start");
		String end1 = req.getParameter("end");
		ArrayList<OrderDTO> odto = order.getSalesList(start1,end1);
		JSONArray ja = new JSONArray();
		for(int i=0; i<odto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("mobile",odto.get(i).getMobile());
			jo.put("menu",odto.get(i).getMenu());
			jo.put("qty",odto.get(i).getQty());
			jo.put("price",odto.get(i).getPrice());
			jo.put("created",odto.get(i).getCreated());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	
	@RequestMapping("/getTotal")
	@ResponseBody
	public String getTotal(HttpServletRequest req) {
		String start1 = req.getParameter("start");
		String end1 = req.getParameter("end");
		int sum=order.getTotal(start1,end1);
		return Integer.toString(sum);
	}
	
	}
	

