<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/header1.jsp" %>
 
    
<section>
        <div class="container">
            <div class="row join-wrap">
                <!--join-form�� �����Ѵ� float���� margin:0 auto-->
                <div class="col-xs-12 col-md-9 join-form">
                    
                    <div class="titlebox">
                        MEMBER INFO                    
                    </div>
                    
                    <p>*ǥ�ô� �ʼ� �Է� ǥ���Դϴ�</p>
                    <table class="table">
                        <tbody class="m-control">
                            <tr>
                                <td class="m-title">*ID</td>
                                <td><input class="form-control input-sm"></td>
                            </tr>
                            <tr>
                                <td class="m-title">*�̸�</td>
                                <td><input class="form-control input-sm"></td>
                            </tr>
                            <tr>
                                <td class="m-title">*��й�ȣ</td>
                                <td><input class="form-control input-sm"></td>
                            </tr>
                            <tr>
                                <td class="m-title">*��й�ȣȮ��</td>
                                <td><input class="form-control input-sm"></td>
                            </tr>
                            <tr>
                                <td class="m-title">*E-mail</td>
                                <td>
                                    <input class="form-control input-sm">@
                                    <select class="form-control input-sm sel">
                                        <option>naver.com</option>
                                        <option>gmail.com</option>
                                        <option>daum.net</option>
                                    </select>
                                    <button class="btn btn-info">�ߺ�Ȯ��</button>
                                </td>
                            </tr>
                            <tr>
                                <td class="m-title">*�޴���</td>
                                <td>
                                    <input class="form-control input-sm sel"> -
                                    <input class="form-control input-sm sel"> -
                                    <input class="form-control input-sm sel">
                                </td>
                            </tr>
                            <tr>
                                <td class="m-title">*�ּ�</td>
                                <td><input class="form-control input-sm add"></td>
                            </tr>
                            <tr>
                                <td class="m-title">*���ּ�</td>
                                <td><input class="form-control input-sm add"></td>
                            </tr>
                        </tbody>
                    </table>
                    
                    <div class="titlefoot">
                        <button class="btn">����</button>
                        <button class="btn">���</button>
                    </div>
                    
                </div>


            </div>

        </div>

    </section>
    
    
    <footer>
        <div class="copyright py-4 text-center text-white">
            <div class="container bounceIn animate">
                <small>Copyright
                    <!-- &copy; --> 2019.<a href=""> Min and Park</a></small>
            </div>
        </div>
    </footer>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>