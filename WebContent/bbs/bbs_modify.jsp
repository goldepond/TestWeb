<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/bbs_header.jsp" %>
     <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 col-sm-12 join-form">
                    <h2>�Խ��� ����<small>(�������̱ñ��ϼ���?)</small></h2>
	
                    <form action="update_toview.writeBoard" method="post">
                        <div class="form-group">
                            <label>�۹�ȣ  </label>
                             <input type="text"  value="${vo.bno}" name="bno" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label>�۾��� </label>
                            <input type="text"   value="${vo.writer}" name="writer" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label> ���� </label>
                            <input type="text" class="form-control" placeholder="${vo.title}" name="title">
                        </div>
                        <div class="form-group">
                            <label>�� ����</label>
                            <textarea class="form-control" rows="5" placeholder="${vo.content}"  name="content"></textarea>
                        </div>
							</type>
                        <!--��������: ��ư�� ��Ŭ���� ����ϴ� �ڹٽ�ũ��Ʈ�� �̿��ؾ� �մϴ�-->
                        <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='bbs_getInstance.writeBoard'">���</button>
                            <button type="submit" class="btn btn-info">����</button>
                            <button type="button" class="btn btn-default" onclick="location.href='delete.writeBoard?bno=${vo.bno}'">����</button>
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