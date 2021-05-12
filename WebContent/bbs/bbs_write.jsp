<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/bbs_header.jsp" %>
    
       
    <!--�۾��⸸ ����Ǵ� css-->   
    <style>
        .table-striped {
            text-align: center; 
            border: 2px solid #737373; 
        }

        .table-striped>tbody>tr {
            background-color: #f9f9f9
        }
    </style>


    <section>
        <div class="container" style="margin-top: 5%;">
            <div class="row">
                <form action="write_ok.writeBoard" method="post">
                    <table class="table table-striped" >
                        <thead>
                            <tr>
                                <th colspan="2" style="background-color: #9DCAFF; text-align: center;">�Խ��� �۾���</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input type="text" class="form-control" placeholder="�ۼ���" name="writer" maxlength="50"></td>
                            </tr>
                            <tr>
                                <td><input type="text" class="form-control" placeholder="�� ����" name="title" maxlength="50"></td>
                            </tr>
                            <tr>
                                <td><textarea rows="15" class="form-control" placeholder="1000 ���� ����" name="content" maxlength="1000" ></textarea></td>
                            </tr>
                        </tbody>
                    </table>
                    
                    <input type="button" class="btn btn-primary pull-left" value="���" onclick="location.href='bbs_getInstance.writeBoard'">
                    <input type="submit" class="btn btn-primary pull-right" value="�۾���" onclick="location.href='write_ok.writeBoard'">
                </form>
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