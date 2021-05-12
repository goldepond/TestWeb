package com.TestWeb.board.model;

import java.sql.Timestamp;

public class BoardUserVO {
	private String id;
	private String pw;
	private String name;

	private String phone1;
	private String phone2;
	private String phone3;

	private String email_1;
	private String email_2;

	private String address1;
	private String address2;

	private Timestamp regdate;

	// ========================================
	public BoardUserVO(String id, String pw, String name, String phone1, String phone2, String phone3, String email_1,
			String email_2, String address1, String address2, Timestamp regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.email_1 = email_1;
		this.email_2 = email_2;
		this.address1 = address1;
		this.address2 = address2;
		this.regdate = regdate;
	}

	public BoardUserVO() {
		// TODO Auto-generated constructor stub
	}
	// ========================================



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getEmail_1() {
		return email_1;
	}

	public void setEmail_1(String email_1) {
		this.email_1 = email_1;
	}

	public String getEmail_2() {
		return email_2;
	}

	public void setEmail_2(String email_2) {
		this.email_2 = email_2;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}


	// ========================================

}
