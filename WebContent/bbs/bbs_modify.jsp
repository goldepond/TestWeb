<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/bbs_header.jsp" %>
     <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 col-sm-12 join-form">
                    <h2>게시판 수정<small>(디자인이궁금하세요?)</small></h2>
	
                    <form action="update_toview.writeBoard" method="post">
                        <div class="form-group">
                            <label>글번호  </label>
                             <input type="text"  value="${vo.bno}" name="bno" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label>글쓴이 </label>
                            <input type="text"   value="${vo.writer}" name="writer" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label> 제목 </label>
                            <input type="text" class="form-control" placeholder="${vo.title}" name="title">
                        </div>
                        <div class="form-group">
                            <label>글 내용</label>
                            <textarea class="form-control" rows="5" placeholder="${vo.content}"  name="content"></textarea>
                        </div>
							</type>
                        <!--구현로직: 버튼은 온클릭을 사용하던 자바스크립트를 이용해야 합니다-->
                        <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='bbs_getInstance.writeBoard'">목록</button>
                            <button type="submit" class="btn btn-info">수정</button>
                            <button type="button" class="btn btn-default" onclick="location.href='delete.writeBoard?bno=${vo.bno}'">삭제</button>
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