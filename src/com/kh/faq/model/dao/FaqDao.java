package com.kh.faq.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.kh.faq.model.vo.Faq;
import com.kh.notice.model.dao.NoticeDao;
import static com.kh.common.JDBCTemplate.*;

public class FaqDao {
	
	private Properties prop = new Properties();
	
	public FaqDao() {
		
		String fileName = NoticeDao.class.getResource("/sql/faq/faq-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Faq> selectList(Connection conn){
		
		ArrayList<Faq> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				list.add(new Faq(rset.getInt("faq_no"),
								 rset.getString("question"),
								 rset.getString("answer")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

}
