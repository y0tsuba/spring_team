package com.eat.domain;

import java.security.Timestamp;

public class UserDAO {
	private int userno;
	private String user_id;
	private String user_nickname;
	private String user_password;
	private String user_name;
	private String user_address;
	private String user_phonenumber;
	private String user_email;
	private Timestamp regdate;
	private String sessionkey;
	private int user_point;
	private int user_gradeno;
	
	
	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDAO(int userno, String user_id, String user_nickname, String user_password, String user_name,
			String user_address, String user_phonenumber, String user_email, Timestamp regdate, String sessionkey,
			int user_point, int user_gradeno) {
		super();
		this.userno = userno;
		this.user_id = user_id;
		this.user_nickname = user_nickname;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_phonenumber = user_phonenumber;
		this.user_email = user_email;
		this.regdate = regdate;
		this.sessionkey = sessionkey;
		this.user_point = user_point;
		this.user_gradeno = user_gradeno;
	}

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_phonenumber() {
		return user_phonenumber;
	}

	public void setUser_phonenumber(String user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public String getSessionkey() {
		return sessionkey;
	}

	public void setSessionkey(String sessionkey) {
		this.sessionkey = sessionkey;
	}

	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public int getUser_gradeno() {
		return user_gradeno;
	}

	public void setUser_gradeno(int user_gradeno) {
		this.user_gradeno = user_gradeno;
	}

	@Override
	public String toString() {
		return "UserDAO [userno=" + userno + ", user_id=" + user_id + ", user_nickname=" + user_nickname
				+ ", user_password=" + user_password + ", user_name=" + user_name + ", user_address=" + user_address
				+ ", user_phonenumber=" + user_phonenumber + ", user_email=" + user_email + ", regdate=" + regdate
				+ ", sessionkey=" + sessionkey + ", user_point=" + user_point + ", user_gradeno=" + user_gradeno + "]";
	}	
	
}
