<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<title>BBS Test</title>

</head>

<body>
	<nav class="navbar navbar-default" id="nav">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="##">MIN and PARK</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a
					href="<%=request.getContextPath()%>/index.jsp"
					style="margin-right: 10px;">����</a></li>
				<li><a
					href="<%=request.getContextPath()%>/bbs/bbs_getInstance.writeBoard">�Խ���</a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">�����ϱ�<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a
							href="<%=request.getContextPath()%>/user/user_login.jsp">�α���</a></li>
						<li><a
							href="<%=request.getContextPath()%>/user/user_join.jsp">ȸ������</a></li>
					</ul></li>
			</ul>

		</div>
	</nav>