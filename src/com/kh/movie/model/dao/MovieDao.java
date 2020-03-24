package com.kh.movie.model.dao;

import static com.kh.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.menubar.controller.NewMoviesDto;
import com.kh.menubar.controller.TopMovieDto;
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
	public List<Movie> selectScreen(Connection conn, String theaterNo, String screenDate) {
		List<Movie> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectS");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, theaterNo);
			pstmt.setString(2, screenDate);
			
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
	
	public List<TopMovieDto> topFiveMovies(Connection conn, Integer num) {
		List<TopMovieDto> tmd = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("topFiveMovies");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
		
			rset = pstmt.executeQuery();
			while(rset.next()) {
				tmd.add(new TopMovieDto(rset.getInt("MOVIE_NO"),rset.getInt("COUNT"),
								rset.getInt("MAXNO"),rset.getString("MODIFY_NAME")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return tmd;
	}
	public List<NewMoviesDto> newMovies(Connection conn) {
		List<NewMoviesDto> nm = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("newMovies");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				nm.add(new NewMoviesDto(rset.getInt("MOVIE_NO"), rset.getDate("ON_DATE"),
						rset.getInt("AGE_LIMIT"), rset.getString("TITLE"), rset.getString("MODIFY_NAME")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return nm;
	}
	
}
