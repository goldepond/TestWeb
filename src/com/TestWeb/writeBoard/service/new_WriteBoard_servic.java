package com.TestWeb.writeBoard.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.writeBoard.model.writeBoardDAO;

public class new_WriteBoard_servic implements writeBoardInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		
		//DAO객체 생성
		writeBoardDAO dao = writeBoardDAO.getInstance();
		dao.regist(writer, title, content);
	}

}
