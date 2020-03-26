package com.kh.movie.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kh.movie.model.dao.MovieDao;
import com.kh.movie.model.vo.Movie;

public class MovieService {
	
	public Movie selectList(int movieNo){
		
		Connection conn = getConnection();
		Movie m = new MovieDao().selectList(conn, movieNo);
		
		
		close(conn);
		return m;
		
	}

}
