package com.kh.movie.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import static com.kh.common.JDBCTemplate.*;

import com.kh.movie.model.vo.Movie;

public class MovieDao {
	Properties prop = new Properties();
	public MovieDao(){ //기본생성자
		String fileName = MovieDao.class.getResource("/sql/movie/movie-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public List<Movie> selectScreen(Connection conn, String theaterNo) {
		List<Movie> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectScreen");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, theaterNo);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				list.add(new Movie(rset.getInt("MOVIE_NO"), rset.getString("TITLE"), rset.getInt("AGE_LIMIT")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
}
