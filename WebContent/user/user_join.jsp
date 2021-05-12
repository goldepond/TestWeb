<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/header1.jsp" %>
  <!--ȸ������ ���� ����Ǵ� css-->
    <style type="text/css">
        .table-striped>tbody>tr {
            background-color: #f9f9f9
        }

        .join-form {
            margin: 0 auto;
            padding: 20px;
            width: 50%;
            float: none;
            background-color: white;
        }
        
        
        .form-group > .sel {
            width: 120px;
            display: inline-block;
            
        }
    </style>

    <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-9 col-sm-12 join-form">
                    <h2>ȸ������<small>(�������)</small></h2>

                    <form action="join_ok.board" method ="post">
                        <div class="form-group">
                            <label for="id">���̵�</label>
                            <input type="text" class="form-control" id="id" name ="id" placeholder="���̵� (�������� 4~12�� �̻�)" >
                        </div>
                        <div class="form-group">
                            <label for="password">��й�ȣ</label>
                            <input type="password" class="form-control" id="password" name="pw" placeholder="��й�ȣ (�� ��/�ҹ���, ����, Ư������ 3���� �̻� ���� 8�� �̻�)">
                        </div>
                        <div class="form-group">
                            <label for="password-confrim">��й�ȣ Ȯ��</label>
                            <input type="password" class="form-control" id="password-confrim" name="Check_pw" placeholder="��й�ȣ�� Ȯ�����ּ���.">
                        </div>
                        <div class="form-group">
                            <label for="name">�̸�</label>
                            <input type="text" class="form-control" id="name" name="name" placeholder="�̸��� �Է��ϼ���.">
                        </div>
                        <!--input2���� input-addon�� �����´� -->
                        <div class="form-group">
                            <label for="hp">�޴�����ȣ</label><br>
                            
                            <input class="form-control sel" name="phone1" placeholder="���� 3����" pattern="[0-9]{3}" maxlength="3"> -
                            <input class="form-control sel" name="phone2" placeholder="xxxx" pattern="[0-9]{3}" maxlength="3"> -
                            <input class="form-control sel" name="phone3" placeholder="xxxx" pattern="[0-9]{3}" maxlength="3">
                        
                        </div>
                        <div class="form-group">
                             <label for="hp">�̸���</label><br>
                            <input class="form-control sel" name="email_1">@
                            <select class="form-control sel" name="email_2">
                                <option>naver.com</option>
                                <option>gmail.com</option>
                                <option>daum.net</option>
                            </select>
                        </div>
                        
                        <div class="form-group">
                            <label for="addr-num">�ּ�</label>
                            <input type="text" class="form-control" id="addr-basic" name="address1" placeholder="�⺻�ּ�">
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" id="addr-detail" name="address2" placeholder="���ּ�">
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-lg btn-success btn-block" onclick="location.href='join_ok.board'">ȸ������</button>
                        </div>
                        <div class="form-group">
                            <button type="button" class="btn btn-lg btn-info btn-block" onclick="location.href='login.board'">�α���</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </section>

	<c:if test="${param.age >= 20 }">
		�����Դϴ�
	</c:if>
	<c:if test="${param.age < 20 }">
		�̼������Դϴ�
	</c:if>

</body>

</html>