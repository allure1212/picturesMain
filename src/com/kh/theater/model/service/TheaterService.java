package com.kh.theater.model.service;

import java.sql.Connection;
import java.util.List;

import com.kh.theater.model.dao.TheaterDao;
import com.kh.theater.model.vo.Theater;
import static com.kh.common.JDBCTemplate.*;

public class TheaterService {

	/** 01. 모든 영화관 정보 -> list
	 * @return		모든 영화관 정보가 담긴 객체 -> list에 담아서
	 */
	public List<Theater> selectAll() {
		Connection conn = getConnection();
		
		List<Theater> list = new TheaterDao().selectAll(conn);
		
		close(conn);
		return list;
	}

	/** 02. 지역내의 영화관 정보 -> list
	 * @param sectionNo	지역번호
	 * @return	지역 내의 영화관 정보객체 -> list에
	 */
	public List<Theater> selectAllBySection(String sectionNo) {
		Connection conn = getConnection();
		
		List<Theater> list = new TheaterDao().selectAllBySection(conn, sectionNo);
		
		close(conn);
		
		return list;
	}

	/** 03. 한 영화관 정보 -> 객체
	 * @param theaterNo	필요한 영화관 번호
	 * @return			영화관 객체
	 */
	public Theater selectTheater(String theaterNo) {
		Connection conn = getConnection();
		
		Theater t = new TheaterDao().selectTheater(conn, theaterNo);
		
		close(conn);
		
		return t;
	}

}
