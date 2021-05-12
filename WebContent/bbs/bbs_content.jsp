<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/bbs_header.jsp" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 col-sm-12 join-form">
                    <h2>�Խ��� �󼼺���<small></small></h2>

                    <form action="update_ok.writeBoard?bno=${vo.bno}" method="post">
                        <div class="form-group" name="regdate">
                            <label>�����${vo.regdate}</label>
                        </div>
                        <div class="form-group" name="bno">
                            <label>�۹�ȣ ${vo.bno}</label>
                        </div>
                        <div class="form-group" name="writer">
                            <label>�۾��� ${vo.writer}</label>
                        </div>
                        <div class="form-group" name="title" >
                            <label>����  ${vo.title}</label>
                        </div>
                        <div class="form-group" name="content">
                            <label>���� ${vo.content}</label>
                        </div>
                        
                        <!--��������: ��ư�� ��Ŭ���� ����ϴ� �ڹٽ�ũ��Ʈ�� �̿��ؾ� �մϴ�-->
                        <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='bbs_getInstance.writeBoard'">���</button>
                            <button type="submit" class="btn btn-info" >����</button>
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