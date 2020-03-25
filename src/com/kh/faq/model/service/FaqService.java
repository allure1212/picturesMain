package com.kh.faq.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.faq.model.dao.FaqDao;
import com.kh.faq.model.vo.Faq;
public class FaqService {
	
	/** 1. Faq리스트 조회용 서비스
	 * @return
	 */
	public ArrayList<Faq> selectList(){
		
		Connection conn = getConnection();
		
		ArrayList<Faq> list = new FaqDao().selectList(conn);
		
		close(conn);
		return list;
	}

}
