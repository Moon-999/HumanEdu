package com.study.springboot;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.DTO;
import com.study.springboot.jdbc.iDao;

@Controller
public class MyController {
	@Autowired
	private iDao dao;
	
	@RequestMapping("/")
	public String view() {
		return "view";
	}
	
	@RequestMapping("/loadView")
	@ResponseBody
	public String loadView() {
		ArrayList<DTO> dto = dao.loadView();
		JSONArray ja = new JSONArray();
		for(int i=0; i<dto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("id",dto.get(i).getId());
			jo.put("content",dto.get(i).getContent());
			
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	
}
