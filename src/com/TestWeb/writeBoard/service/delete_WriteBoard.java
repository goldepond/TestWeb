package com.TestWeb.writeBoard.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.writeBoard.model.writeBoardDAO;

public class delete_WriteBoard implements writeBoardInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String bno = request.getParameter("bno");
		writeBoardDAO dao = writeBoardDAO.getInstance();
		System.out.println(bno);
		dao.delete(bno);

	}

}
