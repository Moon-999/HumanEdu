package com.study.springboot;

import lombok.Data;
//롬복 설치했을 때는 @Data 붙여주기
//buildpath를 눌러서 라이브러리에 롬복.jar 추가해줘야함.

@Data
public class Member {
	String Loginid; //form태그 안의 name과 똑같은 것으로 써야함.
	String passcode;
	
	//<롬복 설치하지 않았을 때는 @Data없이 get/set메서드 만들기
//	public String getLoginid() {
//		return Loginid;
//	}
//	public void setLoginid(String loginid) {
//		Loginid = loginid;
//	}
//	public String getPasscode() {
//		return passcode;
//	}
//	public void setPasscode(String passcode) {
//		this.passcode = passcode;
//	}

}
