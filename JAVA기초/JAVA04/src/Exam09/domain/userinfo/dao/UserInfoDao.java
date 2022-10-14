package Exam09.domain.userinfo.dao;

import Exam09.domain.userinfo.Userinfo;

public interface UserInfoDao {
	void  insertUserinfo(Userinfo userinfo);
	//userinfo.userId,password,userName  3가지가 담겨있음
	void  selectUserinfo(Userinfo userinfo);
	void  deleteUserinfo(Userinfo userinfo);
}
