<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/bbs_header.jsp" %>
  <!--login�� ����Ǵ� css-->   
    <style>
        .table-striped>tbody>tr {
            background-color: #f9f9f9
        }

        .join-form {
            margin: 100px auto;
            padding: 20px;
            width: 50%;
            float: none;
            background-color: white;
        }
    </style>

    <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-9 col-sm-12 join-form">
                    <h2>�α���<small>(�������)</small></h2>
                    
                    
                    <form action="login_ok.board" method="post">
                        <div class="form-group">
                            <label for="id">���̵�</label>
                            <input type="text" class="form-control" id="id" name="id"placeholder="���̵�">
                        </div>
                        <div class="form-group">
                            <label for="password">��й�ȣ</label>
                            <input type="password" class="form-control" id="password" name="pw" placeholder="��й�ȣ ">
                        </div>
                        
                        <div class="form-group">
                            <button type="button" class="btn btn-lg btn-success btn-block"  onclick="location.href='join.board'">ȸ������</button>
                        </div>

                        <div class="form-group">
                            <button type="submit" class="btn btn-lg btn-info btn-block">�α���</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </section>



</body>

</html>