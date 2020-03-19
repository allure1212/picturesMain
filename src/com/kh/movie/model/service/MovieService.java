package com.kh.movie.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.movie.model.dao.MovieDao;
import com.kh.movie.model.vo.Movie;

public class MovieService {

	/** 1. 지역/상영관에 따라 선택된 영화 리스트
	 * @param theaterNo 사용자가 선택한 영화관
	 * @return	위 선택된 지역/영화관에서 상영중인 영화 리스트
	 */
	public List<Movie> selectScreen(String theaterNo) {
		Connection conn = getConnection();
		
		List<Movie> list = new MovieDao().selectScreen(conn, theaterNo);
	
		close(conn);
		return list;
	}

	public List<Movie> selectAllByTheater(String theaterNo) {
		return null;
	}

}
