package com.TestWeb.writeBoard.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TestWeb.utility.pageVO;
import com.TestWeb.writeBoard.model.writeBoardDAO;
import com.TestWeb.writeBoard.model.writeBoardVO;

public class getInstance_WriteBoard implements writeBoardInterface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		int pageNum =1;
		int amount =10;
		
		if(request.getParameter("pageNum") != null && request.getParameter("amount") != null) {
			
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
			amount = Integer.parseInt(request.getParameter("amount"));
		}
		
		writeBoardDAO dao = writeBoardDAO.getInstance();
		
		ArrayList<writeBoardVO> list = dao.getList(pageNum, amount);
		int total = dao.getTotal();
		pageVO pageVO= new pageVO(pageNum, amount, total);
		
		
		//화면에 가지고 나갈 list를 request에 저장
		request.setAttribute("pageVO", pageVO);
		request.setAttribute("list", list);
	}

}
