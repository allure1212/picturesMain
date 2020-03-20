<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		background:white;
		height:800px;
		width:1200px;
		margin:auto;
		margin-top:50px;
	}
	.topTitle{
		width:120px;
		height:30px;
		color:black;
		margin-left:50px;
		text-align:center;
		font-size:30px;
	}
		#listArea{
		
		float:left;
		margin-top: 50px;
		margin-left:30px;
		width:200px;
		height:350px;
		color:white;
		border-radius:10px;
		background-color:white;
	}
	.list{
		display:block;
		border-radius:10px;
		margin-top:30px;
		background-color:#e83a4e;
		width:150px;
		height:30px;
		text-align:center;
		vertical-align:middle;
		margin-left:auto;
		margin-right:auto;
		font-size:15px;
		font-family: 'Nanum Gothic', sans-serif;
		font-weight:bold;
	}
	.list:hover{
		cursor:pointer;
		text-decoration:underline;
		background-color:lightgray;
		color:black;
	}
	#line {
		height:2px;
		background:#000;
		font-size:0;
		line-height:0;
		padding:0;
		margin:20px;
		width:1000px;
		}
		.mainArea{
			float:left;
			background:beige;
			width:260px;
			height:300px;
			margin:20px;
			margin-top:50px;
			border-radius:5px;
		}
	.mainArea > img{
		margin-left:100px;
		margin-top:30px;
	
	}
	.mainContent{
		color:black;
		font-size:25px;
		margin:auto;
		width:200px;
		align:center;
		
	}
	.btns{
		border-radius:10px;
		margin:auto;
		background:lightgray;
	    color: white;
	    text-align: center;
	    text-decoration: none;
	    display: inline-block;
	    font-size: 16px;
	    cursor: pointer;
	    width:140px;
	    height:50px;
	    
	}
	
</style>
</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
	<br clear="both"><br><br><br>
		<div class="topTitle">고객센터</div><div id="line"></div>
		<hr width="500px" color="gray">
		
	<div id="listArea">
		<div class="list">공지사항</div>
		<div class="list">FAQ</div>
		<div class="list">1:1문의</div>
		<div class="list">분실물찾기</div>
		<div class="list">대관문의</div>
	</div>
		
	<div class="mainArea" id="mainArea1">
	<img src="../../resources/images/zoom2.png" width="60px" height="60px" align="center"><br><br><br>
	<p class="mainContent" align="center">자주 찾는 질문</p>
	<br><br><br>
	<div align="center">
	<button type="button" class="btns">바로가기</button>
	</div>
	</div>
	
	<div class="mainArea"id="mainArea2">
	<img src="../../resources/images/msg.png" width="60px" height="60px" align="center"><br><br><br>
	<p class="mainContent" align="center"> E-mail 문의</p>
	<br><br><br>
	<div align="center">
	<button type="button" class="btns">문의하기</button>
	</div>
	</div>
	
	<div class="mainArea"id="mainArea3">
	<img src="../../resources/images/book.png" width="60px" height="60px" align="center"><br><br><br>
	<p class="mainContent" align="center">내 문의내역 확인</p>
	<br><br><br>
	<div align="center">
	<button type="button" class="btns">문의내역 조회</button>
	</div>
	</div>	
		
		
	</div>





</body>
</html>