package com.kh.movie.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.kh.movie.model.dao.MovieDao;
import com.kh.movie.model.vo.Movie;
import com.kh.movie.model.vo.MovieCBS;
import com.kh.movie.model.vo.PageInfo;
import com.kh.still_image.model.vo.StillImageCBS;

public class MovieService {

	/** 1. 吏��뿭/�긽�쁺愿��뿉 �뵲�씪 �꽑�깮�맂 �쁺�솕 由ъ뒪�듃
	 * @param theaterNo �궗�슜�옄媛� �꽑�깮�븳 �쁺�솕愿�
	 * @return	�쐞 �꽑�깮�맂 吏��뿭/�쁺�솕愿��뿉�꽌 �긽�쁺以묒씤 �쁺�솕 由ъ뒪�듃
	 */
	public List<Movie> selectScreen(String theaterNo, String screenDate) {
		Connection conn = getConnection();
		
		List<Movie> list = new MovieDao().selectScreen(conn, theaterNo, screenDate);
	
		close(conn);
		return list;
	}

	public List<Movie> selectAllByTheater(String theaterNo) {
		return null;
	}
	
	public int insertMovie(MovieCBS mv, String[] genres, ArrayList<StillImageCBS> list) {
		
		Connection conn = getConnection();
		
		int result1 = new MovieDao().insertMovie(conn,mv);
		
		int result2 = new MovieDao().insertMovieGenre(conn,genres);
		
		int result3 = new MovieDao().InsertStillImage(conn,list);
		
		
		if(result1*result2*result3 ==0) {
			commit(conn);
		
		}else {
			
			rollback(conn);
		}
		close(conn);
		return result1*result2*result3;
	}
	
	public int getOnListCount() {
		
		Connection conn = getConnection();

		int listCount = new MovieDao().getOnListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	public ArrayList<MovieCBS> selectOnList(PageInfo pi){
		Connection conn = getConnection();
		
		ArrayList<MovieCBS> list = new MovieDao().selectOnList(conn,pi);
	
		close(conn);
		
		return list;

	}
	
	public ArrayList<MovieCBS> selectComingList(PageInfo pi){
		Connection conn = getConnection();
		
		ArrayList<MovieCBS> list = new MovieDao().selectComingList(conn,pi);
		
		close(conn);
		
		return list;
		
	}
	
	public int getComingListCount() {
		
		Connection conn = getConnection();

		int listCount = new MovieDao().getComingListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	public int getOffListCount() {

		Connection conn = getConnection();

		int listCount = new MovieDao().getOffListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	public ArrayList<Movie> selectOffList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Movie> list = new MovieDao().selectOffList(conn,pi);
		
		close(conn);
		
		return list;
	}

	
	
	
}
