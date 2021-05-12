package com.TestWeb.writeBoard.controller;

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
import com.TestWeb.writeBoard.service.delete_WriteBoard;
import com.TestWeb.writeBoard.service.getInstance_WriteBoard;
import com.TestWeb.writeBoard.service.new_WriteBoard_servic;
import com.TestWeb.writeBoard.service.update_writeBoard;
import com.TestWeb.writeBoard.service.view_writeBoard;
import com.TestWeb.writeBoard.service.writeBoardInterface;


@WebServlet("*.writeBoard")
public class writeBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public writeBoardController() {
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
		// String path = request.getContextPath();

		 writeBoardInterface  service;

		switch (uri) {
		case "/TestWeb/bbs/bbs_getInstance.writeBoard":
			//글쓰기 목록 수정
			service = new getInstance_WriteBoard();
			System.out.println("11111111111111111111111");
			service.execute(request, response);
			System.out.println("0000000000000000000000");
			request.getRequestDispatcher("bbs.jsp").forward(request, response);
			break;
		
		
		case "/TestWeb/bbs/write_ok.writeBoard":
			//글쓰기 
			service = new new_WriteBoard_servic();
			service.execute(request, response);
			response.sendRedirect("bbs_getInstance.writeBoard");
			break;
			
		case "/TestWeb/bbs/update_ok.writeBoard":
			//수정
			service = new view_writeBoard();
			service.execute(request, response);
			request.getRequestDispatcher("bbs_modify.jsp").forward(request, response);
			break;
			
		case "/TestWeb/bbs/update_toview.writeBoard":
			//수정후 view 이동
			service = new update_writeBoard();
			service.execute(request, response);
			
			response.sendRedirect("view_ok.writeBoard?bno="+request.getParameter("bno")); //글 목록
			break;
			
		case "/TestWeb/bbs/view_ok.writeBoard":
			//상세보기
			service = new view_writeBoard();
			service.execute(request, response);
			request.getRequestDispatcher("bbs_content.jsp").forward(request, response);
			break;

	
//==================================================================

//==================================================================
		case "/TestWeb/bbs/delete.writeBoard":
			service = new delete_WriteBoard();
			service.execute(request, response);
			response.sendRedirect("bbs_getInstance.writeBoard");
			break;


		}

	}

}
