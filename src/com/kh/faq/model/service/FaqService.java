package com.kh.faq.model.service;

import static com.kh.common.JDBCTemplate.*;


import java.sql.Connection;
import java.util.ArrayList;

import com.kh.faq.model.dao.FaqDao;
import com.kh.faq.model.vo.Faq;
import com.kh.faq.model.vo.PageInfo;

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


public class FaqService {

	/** faq게시판 리스트 총 개수 조회
	 * @return
	 */
	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new FaqDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	/** faq게시판 리스트 조회
	 * @param pi
	 * @return
	 */
	public ArrayList<Faq> selectList(PageInfo pi) {
		Connection conn = getConnection();
		
		ArrayList<Faq> list = new FaqDao().selectList(conn, pi);
		
		close(conn);
		
		return list;
	}
	
	/** faq게시판 작성
	 * @param f
	 * @return
	 */
	public int insertFaq(Faq f) {
		Connection conn = getConnection();
		
		int result = new FaqDao().insertFaq(conn, f);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	public Faq selectFaq(int faqNo) {
		Connection conn = getConnection();
		
		Faq f = new FaqDao().selectFaq(conn, faqNo);
		
		close(conn);
		
		return f;
	}

}
