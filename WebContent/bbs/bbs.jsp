<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="../include/bbs_header.jsp"%>

<!--게시판만 적용되는 css-->
<style>
.table-striped>tbody>tr {
	background-color: rgba(255, 255, 255)
}

.row h2 {
	color: aliceblue;
}

.pagination-sm {
	margin: 0;
}
</style>


<section>

	<div class="container">
		<div class="row">

			<h2>게시판 목록</h2>
			<table class="table table-striped"
				style="text-align: center; border: 2px solid #737373">
				<thead>
					<tr>
						<th style="background-color: #9DCAFF; text-align: center;">번호</th>
						<th style="background-color: #9DCAFF; text-align: center;">제목</th>
						<th style="background-color: #9DCAFF; text-align: center;">작성자</th>
						<th style="background-color: #9DCAFF; text-align: center;">작성일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${list}">
						<tr>
							<td>${list.bno}</td>
							<td><a href="view_ok.writeBoard?bno=${list.bno}">${list.title }</a></td>
							<td>${list.writer}</a></td>
							<td>${list.regdate}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<div class="text-center">
				<ul class="pagination pagination-sm">

					<li><a
						href="bbs_getInstance.writeBoard?pageNum=${pageVO.startPage-1}&&amount=${pageVO.amount}">이전</a></li>


					<c:forEach var="num" begin="${pageVO.startPage }"
						end="${pageVO.endPage }">
						<li class="${pageVO.pageNum eq num ? 'active':''}"><a
							href="bbs_getInstance.writeBoard?pageNum=${num}&&amount=${pageVO.amount}">2</a>
						</li>
					</c:forEach>

					<li><a
						href="bbs_getInstance.writeBoard?pageNum=${endPage+1} && amount=${pageVO.amount}">다음</a></li>
				</ul>
				<button class="btn btn-info pull-right">글쓰기</button>
			</div>

		</div>
	</div>
</section>

<footer>
	<div class="copyright py-4 text-center text-white">
		<div class="container bounceIn animate">
			<small>${vo} Copyright<!-- &copy; --> 2019.<a href="">
					Min and Park</a></small>
		</div>
	</div>
</footer>

<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>

</body>

</html>
