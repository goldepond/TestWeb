package com.TestWeb.writeBoard.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.board.model.BoardUserVO;
import com.TestWeb.writeBoard.model.writeBoardDAO;

public class update_writeBoard implements writeBoardInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String bno = request.getParameter("bno");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		writeBoardDAO dao = writeBoardDAO.getInstance();
		int result = dao.Update(bno, title, content);
		if (result == 1) {
			
		} else {
		}

	}

}
