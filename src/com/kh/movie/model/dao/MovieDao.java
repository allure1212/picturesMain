package com.kh.movie.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import static com.kh.common.JDBCTemplate.*;
import com.kh.movie.model.vo.Movie;

public class MovieDao {
	
	private Properties prop = new Properties();
	
	public MovieDao() {
		String fileName = MovieDao.class.getResource("/sql/movie/movie-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Movie selectList(Connection conn, int movieNo){
		
		Movie m = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, movieNo);
			
			rset = pstmt.executeQuery();
		
			if(rset.next()) {
				m = new Movie(rset.getInt("MOVIE_NO"),
								   rset.getString("TITLE"),
								   rset.getInt("RUNTIME"),
								   rset.getString("DIRECTOR"),
								   rset.getString("ACTOR"),
								   rset.getInt("AGE_LIMIT"),
								   rset.getString("SYNOPSIS"),
								   rset.getDate("ON_DATE"),
								   rset.getString("STATUS"));
			}
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
			return m;
	
		
	}

}
