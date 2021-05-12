<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file="../include/header1.jsp" %>
    
<section>
        <div class="container">
            <div class="row join-wrap">
                
                <div class="col-xs-12 col-md-9 join-form">
                    
                    <div class="titlebox">
                        MEMBER                   
                    </div>
                    <div>
                        <p>${name}�� ȸ������</p>
                    </div>
                    <div>
                        <button type="button" class="btn btn-primary">ȸ����������</button>
                        <button type="button" class="btn btn-primary" id="delCheck">ȸ�� Ż��</button>
                        
                    </div>
                    <div class="delete-hidden">
                        <form>
                        <input type="password" class="form-control" placeholder="��й�ȣ�� �Է��ϼ���">
                        <button type="button" class="btn btn-primary" >Ȯ��</button>
                        </form>
                    </div>
                    
                    <br>
                    <div>
                        <p>${name}���� �ۼ� �Խù�</p>
                        <table class="table table-striped" style="text-align: center; border: 2px solid #737373">
                    <thead>
                        <tr>
                            <th style="text-align: center;">��ȣ</th>
                            <th style="text-align: center;">����</th>
                            <th style="text-align: center;">�ۼ���</th>
                            <th style="text-align: center;">�ۼ���</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td><a>Test</a></td>
                            <td>Min</td>
                            <td>2019-09-14 08:05</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td><a>Lorem Ipsum is simply dummyg industry.</a></td>
                            <td>MBW</td>
                            <td>2019-09-15 13:05</td>
                        </tr>

                    </tbody>
                </table>
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
    
    
    
    <script>
        //Ż���ư ���÷��� ó��
        var delCheck = document.getElementById("delCheck");
        delCheck.onclick = function() {
            var del  = document.querySelector(".delete-hidden");
            if(del.style.display == "none" || del.style.display == "") {
                del.style.display = "inline";
            } else {
                del.style.display = "none";
            }
        }
    </script>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>