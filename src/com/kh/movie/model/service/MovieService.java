package com.kh.movie.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.menubar.controller.NewMoviesDto;
import com.kh.menubar.controller.TopMovieDto;
import com.kh.movie.model.dao.MovieDao;
import com.kh.movie.model.vo.Movie;

public class MovieService {

	/** 1. 지역/상영관에 따라 선택된 영화 리스트
	 * @param theaterNo 사용자가 선택한 영화관
	 * @return	위 선택된 지역/영화관에서 상영중인 영화 리스트
	 */
	public List<Movie> selectScreen(String theaterNo, String screenDate) {
		Connection conn = getConnection();
		
		List<Movie> list = new MovieDao().selectScreen(conn, theaterNo, screenDate);
	
		close(conn);
		return list;
	}


	/** 2. 메인화면에서 보여줄 예매율 상위5위
	 * @param num 포스터 Level
	 * @return
	 */
	public List<TopMovieDto> topFiveMovies(int num){
		Connection conn = getConnection();
		
		List<TopMovieDto> tmd = new MovieDao().topFiveMovies(conn, num);
		
		close(conn);
		return tmd;
	}
	
	/** 3. 메인화면에서 보여줄 상영예정작
	 * @return
	 */
	public List<NewMoviesDto> newMovies(){
		Connection conn = getConnection();
		
		List<NewMoviesDto> nm = new MovieDao().newMovies(conn);
		
		close(conn);
		
		return nm;
	}
	
}
