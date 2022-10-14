package Exam09.domain.userinfo.dao.oracle;

import Exam09.domain.userinfo.Userinfo;
import Exam09.domain.userinfo.dao.UserInfoDao;

public class UserinfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserinfo(Userinfo userinfo) {
		System.out.println("Insert ORACLE ID: "+userinfo.getUserId());
	}

	@Override
	public void selectUserinfo(Userinfo userinfo) {
		System.out.println("Select ORACLE ID: "+userinfo.getUserId());
	}

	@Override
	public void deleteUserinfo(Userinfo userinfo) {
		System.out.println("Delete ORACLE ID: "+userinfo.getUserId());
	}

}
