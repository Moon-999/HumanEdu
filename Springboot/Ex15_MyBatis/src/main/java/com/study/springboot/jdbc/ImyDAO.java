package com.study.springboot.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImyDAO {
	ArrayList<myDTO> list();
	void insert(String title, String content, String writer);
	bbsDTO view(int bbsid);
	void delete(int id);
	void update(int id, String title, String content, String writer);
}
