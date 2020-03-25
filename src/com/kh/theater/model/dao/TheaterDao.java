package com.kh.theater.model.dao;

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

import com.kh.theater.model.vo.Theater;

public class TheaterDao {
	Properties prop = new Properties();
	public TheaterDao(){ //기본생성자
		String fileName = TheaterDao.class.getResource("/sql/theater/theater-query.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public List<Theater> selectAll(Connection conn) {
		List<Theater> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectAll");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				list.add(new Theater(rset.getInt("THEATER_NO"), rset.getString("NAME"),
						rset.getString("ADDRESS"), rset.getString("PHONE"), rset.getInt("ROOM_COUNT"),
						rset.getString("TRANSPORT"), rset.getString("PARKING"), rset.getDouble("LONGITUDE"),
						rset.getDouble("LATITUDE"), rset.getInt("SECTION_NO")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(rset);
			close(stmt);
		}
		return list;
	}
	
	public List<Theater> selectAllBySection(Connection conn, String sectiontNo){
		List<Theater> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sectiontNo);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Theater(rset.getInt("THEATER_NO"), rset.getString("NAME"),
						rset.getString("ADDRESS"), rset.getString("PHONE"), rset.getInt("ROOM_COUNT"),
						rset.getString("TRANSPORT"), rset.getString("PARKING"), rset.getDouble("LONGITUDE"),
						rset.getDouble("LATITUDE"), rset.getInt("SECTION_NO")));
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		} finally{
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public Theater selectTheater(Connection conn, String theaterNo) {
		Theater t = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectTheater");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, theaterNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				t = new Theater(rset.getInt("THEATER_NO"), rset.getString("NAME"), rset.getString("ADDRESS"),
						rset.getString("PHONE"), rset.getInt("ROOM_COUNT"), rset.getString("TRANSPORT"),
						rset.getString("PARKING"), rset.getDouble("LONGITUDE"), rset.getDouble("LATITUDE"),
						rset.getInt("SECTION_NO"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return t;
	}

}
