package com.TestWeb.writeBoard.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;




public class writeBoardDAO {

	//1. 스스로 객체를 1개 생성합니다.
	private static writeBoardDAO instance = new writeBoardDAO();  
	//2. 외부에서 생성자를 호출할 수 없도록 생성자에 private제한을 붙임
	private writeBoardDAO() {
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");\
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			System.out.println("드라이버 호출 에러!");
		}
		
	}
	
	//3. 외부에서 객체생성을 요구하면 getter메서드를 이용해서 1번의 객체를 반환
	public static writeBoardDAO getInstance() {
		return instance;
	}
	
	///////////////////////////////////////////////////////////////////
	//멤버변수
	private DataSource ds;
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;	
	
	public void regist(String writer, String title, String content)
	{
		String sql = "insert into board(bno, writer, title, content) values (board_seq.nextval, ?,?,?)";
		try {
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			
			pstmt.executeUpdate(); //등록 후 끝...
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	public int Update( String bno, String title, String content)
	{
		int result = 0;
		String sql = " update board set  title =?, content =? , regdate = sysdate where bno = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(3, bno);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			result =pstmt.executeUpdate();
			
		} catch (Exception e) {
			
		}
		return result;
	}
	
	public ArrayList<writeBoardVO> getList(int pageNum, int amount){
		ArrayList<writeBoardVO> list = new ArrayList<>();
		String sql ="select * \r\n" + 
				"from (select rownum rn , a.* \r\n" + 
				"from (select * \r\n" + 
				"    from board \r\n" + 
				"    order by bno desc ) a \r\n" + 
				") where rn>? and rn<=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (pageNum-1)*amount);
			pstmt.setInt(2, (pageNum)*amount);
			rs= pstmt.executeQuery();
			
			while(rs.next())
			{
				int bno = rs.getInt("bno");
				String writer = rs.getString("writer");
				String title = rs.getNString("title");
				String content = rs.getString("content");
				Timestamp regdate = rs.getTimestamp("regdate"); //날짜형은  TimeStamp or Date()
				int hit = rs.getInt("hit");
				
				//=============
				writeBoardVO vo = new writeBoardVO(bno, writer, title, content, regdate, hit);
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();;
		}
		return list;
	}

	public writeBoardVO viewContent (String bno)
	{
		writeBoardVO vo = null;
		String sql = "select * from board where bno=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bno);
			rs = pstmt.executeQuery();
			while(rs.next()){
				int bno2 = rs.getInt("bno");//숫자형은 getInt
				String writer = rs.getString("writer");
				String title = rs.getNString("title");
				String content = rs.getString("content");
				Timestamp regdate = rs.getTimestamp("regdate"); //날짜형은  TimeStamp or Date()
				int hit = rs.getInt("hit");
			
				//한바퀴 회전당 VO를 하나씩 생성
				vo = new writeBoardVO(bno2, writer, title, content, regdate, hit);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return vo;
	}
	
	
	public void delete(String bno)
	{
		String sql = "delete from board where bno = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bno);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	public int getTotal()
	{
		int result =0;
		String sql =  "select count(*) as total from board";
		try {
			conn=ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = rs.getInt("total");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
}
