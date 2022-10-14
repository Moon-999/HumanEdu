package Exam09.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Exam09.domain.userinfo.Userinfo;
import Exam09.domain.userinfo.dao.UserInfoDao;
import Exam09.domain.userinfo.dao.mysql.UserinfoMysqlDao;
import Exam09.domain.userinfo.dao.oracle.UserinfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException{
		Userinfo userinfo = new Userinfo();
		userinfo.setUserId("Human");
		userinfo.setPassword("12345");
		userinfo.setUsername("정문희");
		
		
		
		FileInputStream fis = new FileInputStream("D:\\moon\\JAVA기초\\work-space\\JAVA04\\src\\Exam09\\userinfo\\web\\conf");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		System.out.println("dbType : "+ dbType);
		
		UserInfoDao uid1 = null;
		if(dbType.equals("ORACLE")) {
			uid1 = new UserinfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			uid1 = new UserinfoMysqlDao();
		}
		
		uid1.insertUserinfo(userinfo);
		uid1.selectUserinfo(userinfo);
		uid1.deleteUserinfo(userinfo);
	}
}
