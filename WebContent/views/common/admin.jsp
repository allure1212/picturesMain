<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    
</head>
<style>
    div{;
        box-sizing: border-box;
        }

    #wrap{
        width: 1000px;
        height: 800px;
    }
    #top{
        width: 100%;
        height: 7%;
        background-color: darkgray;
      
    }
    #mode{
        float: right;
        font-size: 20px;
    }

    #body{
        width: 100%;
        height: 88%;

    }
    #navbar{
        width: 20%;
        height: 100%;
        float: left;
        line-height: 80px;
        
    }
    #session{
        float: left;
        width:80%;
        height:100%;
   
    }

    #footer{
        width:100%;
        height:5%;
    }

    .listBtn{
        width: 100%;
        height: 40px;
        border-radius: 10px;
        cursor: pointer;

    }
    .listBtn:hover{
        background-color: grady;
    }
    .menu{
        text-align: center;
        font-size: 15px;
        font-weight: bold;
        line-height: 50px;
        display: none;
        border-bottom: 1px solid gray;
        border-right: 1px soli gray;
        border-bottom-right-radius: 10px;
        

    }




</style>
<body>
   <div id="wrap">
       

    <div id="top">
         <div><img src="로고.png"width="60px;"><div id="mode">관리자 모드</div></div>
         
    </div>

    <div id="body">

        <div id="navbar">
            <button class="listBtn">영화관리</button>
            <div class="menu">
                <label>새영화등록</label><br>
                <label>상영예정작</label><br>
                <label>현재상영작</label><br>
                <label>지난상영작</label>
            </div>
            
            <button class="listBtn">영화관 관리</button>
            <div class="menu">
                <label>영화관 목록</label><br>
                <label>영화관 등록</label><br>
                <label>상영관리</label><br>
                
            </div>
            <button class="listBtn">회원관리</button>
            <div class="menu">
                <label>회원 리스트</label><br>
                <label>블랙 리스트</label><br>
                
            </div>
            <button class="listBtn">게시물관리</button>
            <div class="menu">
                <label>1:1 문의</label><br>
                <label>FAQ</label><br>
                <label>공지사항</label><br>
                <label>리뷰</label><br>
                <label>대관문의</label><br>
                <label>분실물관리</label><br>
                <label>광고관리</label>
            </div>
            <button class="listBtn">통계관리</button>
            <div class="menu">
                <label>방문자 통게</label><br>
                <label>장르별 영화예매 통계</label><br>
                <label>성별 영화 예매 통계</label><br>
                <label>나이별 영화 예매 통계</label><br>
                <label>매출 통계</label>
            </div>
            

        </div>

        <script>
            $(document).ready(function(){
                
                $(".listBtn").on("click",function(){
                    var m = $(this).next();


                    if(m.css("display")=="none"){
                        $(this).siblings(".menu").slideUp();
                        m.slideDown();

                    }else{
                        m.slideUp();
                    }


                });

            });


        </script>


      

        <div id="session"></div>
     
    </div>

    <div id="footer">


    </div>




   





</div>



    
</body>
</html>