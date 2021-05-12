<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/bbs_header.jsp" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 col-sm-12 join-form">
                    <h2>게시판 상세보기<small></small></h2>

                    <form action="update_ok.writeBoard?bno=${vo.bno}" method="post">
                        <div class="form-group" name="regdate">
                            <label>등록일${vo.regdate}</label>
                        </div>
                        <div class="form-group" name="bno">
                            <label>글번호 ${vo.bno}</label>
                        </div>
                        <div class="form-group" name="writer">
                            <label>글쓴이 ${vo.writer}</label>
                        </div>
                        <div class="form-group" name="title" >
                            <label>제목  ${vo.title}</label>
                        </div>
                        <div class="form-group" name="content">
                            <label>내용 ${vo.content}</label>
                        </div>
                        
                        <!--구현로직: 버튼은 온클릭을 사용하던 자바스크립트를 이용해야 합니다-->
                        <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='bbs_getInstance.writeBoard'">목록</button>
                            <button type="submit" class="btn btn-info" >수정</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>


        </section>
    
        <footer>
        <div class="copyright py-4 text-center text-white">
            <div class="container bounceIn animate">
                <small>Copyright<!-- &copy; --> 2019.<a href=""> Min and Park</a></small>
            </div>
        </div>
        </footer>
    
</body>
</html>