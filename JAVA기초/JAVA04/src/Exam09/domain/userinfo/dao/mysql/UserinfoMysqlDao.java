package Exam09.domain.userinfo.dao.mysql;

import Exam09.domain.userinfo.Userinfo;
import Exam09.domain.userinfo.dao.UserInfoDao;

public class UserinfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserinfo(Userinfo userinfo) {
		System.out.println("Insert MySQL ID: "+userinfo.getUserId());
	}

	@Override
	public void selectUserinfo(Userinfo userinfo) {
		System.out.println("Select MySQL ID: "+userinfo.getUserId());
	}

	@Override
	public void deleteUserinfo(Userinfo userinfo) {
		System.out.println("Delete MySQL ID: "+userinfo.getUserId());
	}

}
