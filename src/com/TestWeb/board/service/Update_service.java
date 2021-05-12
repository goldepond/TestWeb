package com.TestWeb.board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.board.model.BoardDAO;
import com.TestWeb.board.model.BoardUserVO;

public class Update_service implements TestBoardService {

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
		
		BoardUserVO vo = new BoardUserVO(id, pw, name, phone1, phone2, phone3, email_1, email_2, address1, address2, null);
		BoardDAO dao= BoardDAO.getInstance();
		int result = dao.update(vo);
		if(result ==1){
			
		}
		else {
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
		}
	}

}
