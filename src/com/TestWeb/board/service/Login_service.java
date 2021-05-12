package com.TestWeb.board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.board.model.BoardDAO;
import com.TestWeb.board.model.BoardUserVO;


public class Login_service implements TestBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)   throws IOException, ServletException{
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardUserVO vo = dao.login(id,pw);
		if(vo ==null)
		{
			try {
				request.getRequestDispatcher("user_login.jsp").forward(request, response);
			} catch (Exception e) {
			}
		}
		else {
		
		}
		
	}

}
