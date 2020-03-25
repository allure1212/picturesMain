<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		color:black;
	}
	#movieDetail{
		width:300px;
		font-size:30px;
		font-weight:bold;
		display:inline-block;
		float:left;
	}
	#movieDetail{
		
		margin-top:70px;
		margin-left:150px;
		color:black;
	}
	#movieMainDetail{
		width:900px;
		height:500px;
		margin-top:100px;
		margin-left:250px;
	}
	#movieImgMain{
		width:400px;
		height:400px;
		border:1px solid black;
	}
	#movieName{
		width:200px;
		height:30px;
		border:1px solid black;
		margin-top:-400px;
		margin-left:500px;
		border-radius:10px;
		font-size:20px;
		font-weight:bold;
		vertical-align:middle;
		line-height:1.5em;
		padding:3px;
	}
	#movieReporter{
		width:300px;
		height:30px;
		border:1px solid black;
		margin-top:30px;
		margin-left:500px;
		border-radius:10px;
		vertical-align:middle; 
		line-height:2em;
		font-weight:bold;
		padding:5px;
	}
	#movieInfo{
		border:1px solid black;
		width:300px;
		height:200px;
		border-radius:10px;
		margin-left:500px;
		margin-top:30px;
		font-weight:bold;
		padding:5px;
	}
	#input{
		margin-left:550px;
		margin-top:30px;
	}
	#input button{
		margin:20px;
		align:center;
	}
	#movieSyno{
		width:400px;
		height:400px;
		border:1px solid black;
		margin-top:30px;
		margin-left:250px;
		text-align:center;
		font-size:15px;
		font-weight:bold;
		padding:10px;
		border-radius:10px;
	}
	#movieStillImg{
		width:600px;
		height:400px;
		border:1px solid black;
		margin-left:800px;
		margin-top:-400px;
	}
	#reviewName{
		margin-left:50px;
		font-weight:bold;
	}
	#reviewMainName{
		margin-left:250px;
		margin-top:50px;
	}
	#reviewTotal{
		margin-left:700px;
		margin-top:-60px;
		font-weight:bold;
		text-align:center;
	}
	.star_score_box{
	 	display:inline-block;
		border:1px solid lightgray;
		width:300px;
		height:70px;
		text-align:center;
		margin-top:8px;
		margin-left:40px;
		padding-top:10px;
		border-radius:5px;
		background:white;
	}
	.star_rate button{
		border:none;
		background:white;
		outline:0;
		cursor:pointer;
	}
	#reviewContent{
		width:400px;
		height:70px;
		margin-left:315px;
		margin-top:-55px;
		border:1px solid lightgray;
		padding-top:10px;
		border-radius:5px;
		background:white;
	}
	#reviewContentDetail{
	    width: 100%;
	    resize: none;
	    font-size: 14px;
	    color:black !important;
	    height:100%;
	    border:none;
	    outline:0;
	    border-radius:5px;
	    background:white;
	}
	#reviewContentBtn{
		width:100px;
		height:70px;
		margin-left:730px;
		margin-top:-80px;
		border:none;
	}
	#reviewContentBtn button{
		width:100%;
		height:100%;
		border-radius:5px;
		background-color:lightsalmon;
		outline:0;
		border:0;
	}
	#reviewBox{
		border:1px solid black;
		width:900px;
		height:100px;
		margin-top:50px;
		margin-left:350px;
		border:3px solid beige;
		background-color:beige;
		border-radius:5px;
	}
	#input button{
		outline:0;
		border:0;
		border-radius:3px;
		background:lightsalmon;
		width:60px;
		height:20px;
	}
	#reviewList tr td{
		color:black;
		border-bottom: 1px solid #444444;
	}
	#reviewList{
		margin-left:350px;
		margin-top:50px;
	}
	

	
</style>

</head>
<body>

	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<div id="movieDetail">
			<img src="../../resources/images/movieChart2.png" width="50px" height="50px" align="center">
			<div id="name1">영화 상세 정보 
				<img src="../../resources/images/line.png" width="300px" height="20px" >
			</div>
		</div>
	<br clear="both">
	<form id="movieMainDetail">
		<div id="movieImgMain">
			<img src="">
		</div>
		
		<div id="movieName">
			<p>조조래빗</p>
		</div>
		<div id="movieReporter">
			<p>예매율 4.3%  98% (실관람평 : 3,654명)</p>
		</div>
		<div id="movieInfo">
			<p>감독 : 타이카 와이티티 /	<br>
				 배우 : 스칼렛 요한슨 ,  로만 그리핀 데이비스 ,  타이카 와이티티 ,  토마신 맥켄지 <br>
				장르 : 드라마, 전쟁, 코미디 / 기본 : 12세 이상, 108분, 미국 <br>
				개봉 : 2020.02.05</p>
		</div>
		<div id="input">
			<button>예매하기</button>
			<img src="../../resources/images/heart1.png" width="30px" height="30px">
			<button>찜하기</button>
		</div>
	</form>
	
	<div id="movieSyno">
		<p><br><br>제2차 세계대전 말기, 엄마 ‘로지’(스칼렛 요한슨)와 단둘이 살고 있는 10살 소년 ‘조조’(로만 그리핀 데이비스). <br><br>
		원하던 독일 소년단에 입단하지만 겁쟁이 토끼라 놀림 받을 뿐이다. 상심한 ‘조조’에게 상상 속 친구 ‘히틀러’(타이카 와이티티)는 유일한 위안이 된다. <br><br>
		‘조조’는 어느 날 우연히 집에 몰래 숨어 있던 미스터리한 소녀 ‘엘사’(토마신 맥켄지)를 발견하게 된다.세상에서 가장 위험한 인물이 왜 여기에?!제2차 세계대전 말기, <br>
		 엄마 ‘로지’(스칼렛 요한슨)와 단둘이 살고 있는 10살 소년 ‘조조’(로만 그리핀 데이비스). 위안이 된다</p>
	</div>
	<div id="movieStillImg">
		<img>
	</div>
	
	<div class="reviewForm">
		<form>
			<div id="reviewMainName">
				<div id="reviewName">평점 및 관람평</div>
				<img src="../../resources/images/line.png" width="300px" height="20px" >
				<div id="reviewTotal">총 평점 <img src="../../resources/images/star.png" width="30px" height="30px"></div>
			</div>
		</form>
		<form id="reviewBox">
		<div class="star_score_box">
			<strong class="score_info">9 점</strong><br>
			<div class="star_info">
				<div class="star_rate">
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>
					<button type="button"><img src="../../resources/images/reviewStarOff.png" width="20px" height="20px"></button>				
				</div>
			</div>
				<div id="reviewContent"><textarea id="reviewContentDetail" placeholder="평점 및 관람평을 작성해주세요."></textarea></div>
				<div id="reviewContentBtn"><button type="submit">관람평 작성</button></div>
		</div>
	</form>
	
	<form id="reviewListArea">
		<table id="reviewList">
			<tr>
				<td width="100px" height="30px">test123</td>
				<td width="100px">9점</td>
				<td width="600px">작성내요아ㅏㅏㅏㅏㅏㅏㅏㅏ너무재밌네요앙하핳ㅏ</td>
				<td width="60px">신고</td>
			</tr>
			<tr>
				<td width="100px" height="30px">test123</td>
				<td width="100px">9점</td>
				<td width="600px">작성내요아ㅏㅏㅏㅏㅏㅏㅏㅏ너무재밌네요앙하핳ㅏ</td>
				<td width="60px">신고</td>
			</tr>
			<tr>
				<td width="100px" height="30px">test123</td>
				<td width="100px">9점</td>
				<td width="600px">작성내요아ㅏㅏㅏㅏㅏㅏㅏㅏ너무재밌네요앙하핳ㅏ</td>
				<td width="60px">신고</td>
			</tr>
			<tr>
				<td width="100px" height="30px">test123</td>
				<td width="100px">9점</td>
				<td width="600px">작성내요아ㅏㅏㅏㅏㅏㅏㅏㅏ너무재밌네요앙하핳ㅏ</td>
				<td width="60px">신고</td>
			</tr>
			<tr>
				<td width="100px" height="30px">test123</td>
				<td width="100px">9점</td>
				<td width="600px">작성내요아ㅏㅏㅏㅏㅏㅏㅏㅏ너무재밌네요앙하핳ㅏ</td>
				<td width="60px">신고</td>
			</tr>
		</table>
	</form>
</div>
	
	
	
	<br><br><br><br><br><br><br><br><br>
	</div>

</body>
</html>