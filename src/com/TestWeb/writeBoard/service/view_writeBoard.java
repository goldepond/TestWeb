package com.TestWeb.writeBoard.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.writeBoard.model.writeBoardDAO;
import com.TestWeb.writeBoard.model.writeBoardVO;

public class view_writeBoard implements writeBoardInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String bno = request.getParameter("bno");
		writeBoardDAO dao = writeBoardDAO.getInstance();
		writeBoardVO vo = dao.viewContent(bno);
		request.setAttribute("vo", vo);

	}

}
