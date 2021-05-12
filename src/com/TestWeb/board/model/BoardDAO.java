package com.TestWeb.board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.TestWeb.utility.CloseUtil;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();

	private BoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("성공");
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			System.out.println("드라이버 호출 에러!");
			e.printStackTrace();
		}
	}

	public static BoardDAO getInstance() {
		return instance;
	}

//================================================
	private DataSource ds; // 데이터베이스 연결풀을 저장해놓는 객체

	private String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private String uid = "JSP";
	private String upw = "JSP";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public BoardUserVO login(String id, String ps) {
		BoardUserVO vo = null;
		String sql = "select * from usersTest where id =? and pw =?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				String id2 = rs.getString("id");
				String name = rs.getString("name");

				vo = new BoardUserVO();
				vo.setId(id2);
				vo.setName(name);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(conn, pstmt, rs);
		}
		System.out.println(vo);
		return vo;
	}

	// ==================================================================
	public int CheckID(String id) {
		int result = 0;
		String sql = "select * from usersTest where id =? ";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 0;
			} else {
				result = 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			CloseUtil.close(conn, pstmt, rs);
		}
		return result;
	}

	// ==================================================================
	public int join(BoardUserVO vo) {
		System.out.println("구가구가구가구가");
		int result = 0;
		String sql = "insert into usersTest values(?,?,?,?,?,?,?,?,?,?,sysdate)";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getEmail_1());
			pstmt.setString(8, vo.getEmail_2());
			pstmt.setString(9, vo.getAddress1());
			pstmt.setString(10, vo.getAddress2());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	// ==================================================================
	public int update(BoardUserVO vo) {
		int result = 0;
		String sql = "update userTest set pw = ?, name = ?, " + "phone1 = ?, phone2 =? , phone3 =? ,"
				+ "email_1 =? , email_2=? , " + "address1=?, address2=? " + "where id = ?";

		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone1());
			pstmt.setString(5, vo.getPhone2());
			pstmt.setString(6, vo.getPhone3());
			pstmt.setString(7, vo.getEmail_1());
			pstmt.setString(8, vo.getEmail_2());
			pstmt.setString(9, vo.getAddress1());
			pstmt.setString(10, vo.getAddress2());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;

	}
}
