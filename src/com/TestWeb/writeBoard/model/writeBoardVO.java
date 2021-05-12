package com.TestWeb.writeBoard.model;

import java.sql.Timestamp;

public class writeBoardVO {
	private int bno; //숫자
	private String writer; //문자
	private String title;
	private String content;
	private Timestamp regdate; //날짜
	private int hit;
	//===========================================================
	public writeBoardVO(int bno, String writer, String title, String content, Timestamp regdate, int hit) {
		super();
		this.bno = bno;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
	}
	
	public writeBoardVO() {
		// TODO Auto-generated constructor stub
	}
	//===========================================================

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	

}