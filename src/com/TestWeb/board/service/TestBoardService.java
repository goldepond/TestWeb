package com.TestWeb.board.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TestBoardService {
	public void execute(HttpServletRequest request, HttpServletResponse response)   throws IOException, ServletException;
}
