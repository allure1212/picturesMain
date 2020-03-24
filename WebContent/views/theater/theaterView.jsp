<%@page import="javax.naming.ldap.Rdn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,
				com.kh.theater.model.vo.Theater,
				com.kh.theater.model.dao.MovieDto,
				com.kh.theater.model.dao.RoomDto" %>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%
	String screenDate = (String)request.getAttribute("screenDate");
	Theater t = (Theater)request.getAttribute("selectTheater");
	List<MovieDto> movies = (List)request.getAttribute("movies");
%>
<%	
	SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    * {margin:0; padding:0}
    .layout{ width: 1000px; margin: 0 auto; padding:50px;}
    .title {
        width: 300px; font-size: 50px; line-height: 50px;
        text-align: center; font-weight: 800;
        margin-bottom: 50px;
        }
    .theaterInfo { height:300px; width: 50%; float: left; box-sizing: border-box;}
   	
    .theaterInfo p{
        padding: 10px;
        padding-left: 50px;
        font-size: 20px;
        font-weight: 700;
    }
    .theaterInfo span{
        padding: 10px;
        padding-left: 30px;
        font-size: 25px;
        font-weight: 700;
    }
    .theaterInfo span img{
        height: 30px; width: 30px;
        padding: 10px; padding-right: 15px;
        vertical-align: middle;
        }
    .theaterInfo span a{
        font-size: 20px; padding: 10px; cursor: pointer;
    }
    .theaterMap{
        height: 250px;
        width: 250px;
        background-color: plum;
    }
    .timeTable { padding: 30px;}
    .timeTable ul li { list-style: none;}

    .timeTable ul li span{width:26px; height:26px; line-height:26px; margin-right:5px; border-radius:50%; font-weight: 700; display:inline-block; font-size:11px; color:#fff; text-align:center; margin: 20px;}
    .timeTable ul li span.grade_0{background:#5BC77E;}
    .timeTable ul li span.grade_12{background:#4DD6FF;}
    .timeTable ul li span.grade_15{background:#FFC134;}
    .timeTable ul li span.grade_18{background:#ED4C6B;}
    
    .timeList li {padding:20px; float: left;}

</style>
</head>
<body>
	<%@ include file="/views/common/menubar.jsp" %>

<div class="layout">
    <div class="title">
        <p> <%= t.getName() %></p>
    </div>
    <div class="theaterInfo">
        <p>영화관 소개</p>
        <p> 주   소 : <%= t.getAddress() %></p>
        <p>전화번호: <%= t.getPhone() %></p>
        <span><a><img src="<%=contextPath%>/resources/images/transport.png" alt="" />#교통안내</a></span>
        <span><a><img src="<%=contextPath%>/resources/images/location_car_40.png" alt="" />#주차안내</a></span>
    </div>
    <div class="theaterInfo">
        <span><a><img src="<%=contextPath%>/resources/images/location_map_40.png" alt="" />영화관 위치</a></span>
        <div class="theaterMap">
        
        </div>
    </div>

    <form>
        <div>
            
        </div>
        <div class="timeTable">
            <input type="date" value="<%= screenDate %>"/>
            <!-- 영화별 영화시간 나열 -->
            <% for(MovieDto md : movies) { %>
            <ul>
            	<li><span class="grade_<%= md.getAgeLimit() %>"><%= md.getAgeLimit() %></span>
            		<strong><%= md.getTitle() %></strong>
            	</li>
            
				<% for(RoomDto rd : md.getRooms()){ %>
	            <li><ul>
	            	<% String screenTime = sf.format(rd.getScreenDate()); %>
	                <li><a href="#"><%= rd.getRoomName() %>관 <%= screenTime %></a></li>
	            </ul></li>
	            <% } %>
	         </ul>
            <% } %>
        </div>



    </form>
</div>  



</body>
</html>