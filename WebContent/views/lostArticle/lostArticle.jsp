<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.kh.lostarticle.model.vo.Lostarticle" %>
<%
	ArrayList<Lostarticle> list = (ArrayList<Lostarticle>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
        *{margin:0; padding:0;}
        .layout{ position: relative; margin:0 auto; width: 1200px; }
        ul li{list-style: none;}
        #noticeMenu {position:absolute; width:250px; left:0; top:40px; }
        #noticeMenu h2{width:100%; height:100px; background:#9C0E0E; color:#fff; text-align: center; line-height:100px;}
        #noticeMenu ul {border-left:1px solid #ddd; border-right:1px solid #ddd;}
        #noticeMenu ul li{border-bottom:1px solid #ddd; padding:15px; box-sizing: border-box;}
        #noticeMenu ul li a{display:block; text-decoration:none; color:#616060; }
        #noticeMenu ul li a img{display:inline-block; vertical-align: middle; margin-right:15px;}
        #noticeMenu ul li a span{display:inline-block; vertical-align: middle;}


        #noticeContent { padding-left:270px; padding-top:40px; }
        #noticeContent>p { font-size: 30px; font-weight: 800;}
        #noticeContent table{ text-align: center; font-weight: 800; margin-bottom: 50px; margin:15px auto;}
        #noticeContent table tr td {width: 400px; height: 35px;}
        #noticeContent table tr td>input:nth-child(1) {text-align: center;}
        #noticeContent table tr td>input:nth-child(2){ width:300px; height: 50px; box-sizing: border-box;}
        #noticeContent table tr td #searchBtn {width: 50px; height: 50px; background:#9C0E0E; border:0; cursor:pointer; display: inline-block; vertical-align: bottom;}
        #noticeContent table tr td #requestBtn {width: 100px; height: 30px;}
    
    .layout{
    	color:black;
    }
    #noticeContent p, #noticeContent h1{
    color:black;}
 
	#requestBtn{
		border:none;
		outline:none;
		background:beige;
		border-radius:5px;
	}
	
	.listArea tbody tr td, .listArea thead tr th{color:black;}
	.listArea{margin-top:50px;}
	.lostList{
		display:inline-block;
		margin-left:100px;
	}
	.lostList div{
		float:left;
		margin-left:70px;
		padding:5px;
	}
	.lostList:hover{
		cursor:pointer;
		background:gray;
	}
	
	
    </style>
    
    
</head>
<body>
<%@ include file="../common/menubar.jsp" %>
<br><br>


<div class="layout">

    <div class="container">
        <div id="noticeMenu">
            <h2>고객센터</h2>
            <ul>
                <li><a href=""><img src="<%=contextPath %>/resources/images/req1.png" alt=""><span>1:1문의</span></a></li>
                <li><a href=""><img src="<%=contextPath %>/resources/images/req2.png" alt="">FAQ</a></li>
                <li><a href=""><img src="<%=contextPath %>/resources/images/req3.png" alt="">공지사항</a></li>
                <li><a href=""><img src="<%=contextPath %>/resources/images/req4.png" alt="">분실물찾기</a></li>
                <li><a href=""><img src="<%=contextPath %>/resources/images/req5.png" alt="">대관문의</a></li>
            </ul>
        </div>
        
        <div id="noticeContent">
        <p>분실물찾기.</p>
        <br><br><br>
        	<table class="listArea" align="center">
			<thead>
				<tr>	
					<th width="80">번호</th>
					<th width="300">제목</th>
					<th width="50">비밀글</th>
					<th width="80">답변여부</th>
				</tr>
			</thead>
		</table>
		<hr>
		
		<%if(list.isEmpty()){ %>
		<%}else{ %>
			<%for(Lostarticle l : list){ %>
				<div class="lostList">
					<div><%=l.getLostNo() %></div>
					<div><%=l.getTitle() %></div>
					<div><%=l.getSecretStatus() %></div>
					<div><%=l.getReplyStatus() %></div>
				</div>
			<%} %>
		<%} %>
		
 	<div class="btns">
 		<button onclick="insertLost();">작성하기</button>
 		<button onclick="">수정하기</button>
 	</div>
   </div>
</div>

<script>
	$(function(){
		$(".lostList").click(function(){
			var lost_No = $(this).children().eq(0).text();
			location.href="<%=contextPath%>/lostDetail.lo?lostNo="+ lost_No;
		});
	});
	
	function insertLost(){
		location.href="<%=contextPath%>/lostForm.lo";
	}
</script>

</div>	
</body>


</html>