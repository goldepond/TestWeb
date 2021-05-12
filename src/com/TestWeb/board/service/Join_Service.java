package com.TestWeb.board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.board.model.BoardDAO;
import com.TestWeb.board.model.BoardUserVO;

public class Join_Service implements TestBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)   throws IOException, ServletException{

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		String name = request.getParameter("name");

		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");

		String email_1 = request.getParameter("email_1");
		String email_2 = request.getParameter("email_2");

		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");

		// ====================================
		BoardDAO dao = BoardDAO.getInstance();
		System.out.println(id);
		int result = dao.CheckID(id);
		if(result == 0)
		{
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
		}
		else {
			//회원가입;
			BoardUserVO vo = new BoardUserVO(id, pw, name, phone1, phone2, phone3, email_1, email_2, address1, address2, null);
			dao.join(vo);
			
			request.setAttribute("name", name);
		}
		

	}

}
