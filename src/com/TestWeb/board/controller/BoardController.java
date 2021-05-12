package com.TestWeb.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.board.service.Join_Service;
import com.TestWeb.board.service.Login_service;
import com.TestWeb.board.service.TestBoardService;
import com.TestWeb.board.service.Update_service;

@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");// utf-8로 지정
		String uri = request.getRequestURI();
		//String path = request.getContextPath();

		TestBoardService service;

		switch (uri) {
		case "/TestWeb/user/join.board":
			request.getRequestDispatcher("user_join.jsp").forward(request, response);
			break;

		case "/TestWeb/user/join_ok.board":
			service = new Join_Service();
			service.execute(request, response);
			System.out.println("원투쓰리");
			request.getRequestDispatcher("user_mypage.jsp").forward(request, response);
			break;
//==================================================================
		case "/TestWeb/user/login.board":
			System.out.println("원투쓰리");
			request.getRequestDispatcher("user_login.jsp").forward(request, response);
			break;

		case "/TestWeb/user/login_ok.board":
			service = new Login_service();
			service.execute(request, response);
			request.getRequestDispatcher("user_mypage.jsp").forward(request, response);
			break;

//==================================================================
		case "/TestWeb/user/update.board":
			request.getRequestDispatcher("user_mypageinfo.jsp").forward(request, response);
			break;
			
		case "/TestWeb/user/update_ok.board":
			service = new Update_service();
			service.execute(request, response);
			request.getRequestDispatcher("user_mypage.jsp").forward(request, response);
			break;

		}
	}

}
