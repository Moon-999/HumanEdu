package com.study.springboot.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface iOrder {
	void addOrder(String mobile, String menu, int qty, int price);
	//ArrayList<OrderDTO> loadOrder(); 
	ArrayList<OrderDTO> getSalesList(String start,String end);
	int getTotal(String start, String end);
}
