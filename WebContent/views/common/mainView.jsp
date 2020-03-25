<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
				com.kh.menubar.controller.TopMovieDto,
				com.kh.movie.model.service.MovieService,
				com.kh.menubar.controller.NewMoviesDto" %>
<%
	List<TopMovieDto> tmdSlide = new MovieService().topFiveMovies(2);
	List<TopMovieDto> tmdPoster = new MovieService().topFiveMovies(0);
	List<NewMoviesDto> nm = new MovieService().newMovies();
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>

<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/swiper.min.css"/>
    <script src="<%= request.getContextPath() %>/resources/js/jquery-1.11.2.min.js"></script>
    <script src="<%= request.getContextPath() %>/resources/js/swiper.min.js"></script>
    <script>
        $(document).ready(function(){
          var swiper = new Swiper('.swiper-container', {
        navigation: {
          nextEl: '.swiper-button-next',
          prevEl: '.swiper-button-prev',
        },
        pagination: {
        el: '.swiper-pagination',
        clickable: true,
      },
      });
        });
  
      
    </script>
    <style>
        *{margin:0; padding:0;}
        .layout{ width: 1200px; margin: 0 auto; padding: 30px; color: #C1041D;}
        .swiper-slide{ height:500px; background:#ccc; font-weight: 900; font-size: 30px; }
        .swiper-slide img { heigth:100%; width:100%; display:block;}
        .swiper-button-next, .swiper-button-prev{width:46px; height:80px; margin-top:-40px;}
        .swiper-button-next {background-image: url(<%= request.getContextPath() %>/resources/images/visual_arrow_right.png);}
        .swiper-button-prev {background-image: url(<%= request.getContextPath() %>/resources/images/visual_arrow_left.png);}
        .swiper-pagination-bullet-active {background:red;}
        /* .movie-posters{overflow: hidden;} */
        .movie-posters:after{content:""; display: block; clear: both;}
        .movie-poster{ width: 16.8%; height: 280px; margin:40px 0 40px 4%; background:powderblue; float: left;}
        .movie-poster img {width: 100%; height: 100%;}
        .movie-poster:nth-child(1){margin-left:0;}
        
        .movie-news:after{content:""; display: block; clear: both;}
        .movie-news > p {font-size: 35px; font-weight: 700; padding: 20px; padding-left: 40px;}
        .movie-new{ width: 22%; height: 250px; float: left; margin-left:4%; margin-top:1%}
        .movie-new.first{margin-left:0;}
        .movie-new a {display:block;text-align:center;}
        .movie-new a img {display:inline-block; width: 150px; height: 200px; background: lightsteelblue;}
        .movie-new .cont {padding:0 30px;}
        .movie-new .cont p {margin:7px; font-weight: 700;}
    </style>
</head>
<body>
	<%@ include file="/views/common/menubar.jsp" %>

<div class="layout">
    <!-- Swiper -->
  <div class="swiper-container">
    <div class="swiper-wrapper">
    <% for(int i=0; i<5; i++ ){ %>
    	<div class="swiper-slide">
        <img src="<%= request.getContextPath() %>/resources/images/<%= tmdSlide.get(i).getModifyName() %>" onerror="this.src='../../resources/images/noImage.jpg'" alt="" /></div>
    <% } %>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination"></div>
    <!-- Add Arrows -->
    <div class="swiper-button-next"></div>
    <div class="swiper-button-prev"></div>
  </div>

  <div class="movie-posters">
  	<% for(int i=0; i<5; i++){ %>
    <div class="movie-poster"><a><img src="<%= request.getContextPath() %>/resources/images/<%= tmdPoster.get(i).getModifyName() %>" onerror="this.src='../../resources/images/noImageMain.jpg'" alt="" /></a></div>
  	<% } %>
  </div>

  <div class="movie-news">
    <p>상영예정작</p>
	<!-- start visual slide -->
	<% 
		boolean isFirst = true;
		for(NewMoviesDto nmd: nm) { %>
 	   <div class="movie-new <%= isFirst ? "first" : "" %>">
	      <a>
	      	<img 
	      		src="<%= request.getContextPath() %>/resources/images/<%= nmd.getModifyName() == null ? "noImageMain.jpg" : nmd.getModifyName() %>" 
	      		alt="no-image"
      		/>
	      </a>
	      <div class="cont">
	        <p>영화제목 : <%= nmd.getTitle() %></p>
	        <p>영화개봉일 : <%= nmd.getOnDate() %> </p>
	        <input type="hidden" value="<%= nmd.getMovieNo() %>"/>
	      </div>
    	</div>
	<%} %>
	<%
		for (int i = 0; i < 4 - nm.size(); i++) {
	%>
	 	   <div class="movie-new <%= isFirst ? "first" : "" %>">
	      <a>
	      	<img 
	      		src="<%= request.getContextPath() %>/resources/images/noImageMain.jpg" 
	      		alt="no-image"
      		/>
	      </a>
	      <div class="cont">
	        <p>영화제목 : 미개봉 </p>
	        <p>영화개봉일 : 미개봉 </p>
	        <input type="hidden" value=""/>
	      </div>
    	</div>
	<% 
		}
	%>
	<!-- end visual slide -->
 
  </div>
</div>


</body>
</html>