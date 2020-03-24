package com.kh.member.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberService {

	
	public Member loginMember(String userId, String userPwd) {
		Connection conn = getConnection();
		
		Member loginUser = new MemberDao().loginMember(conn, userId, userPwd);

		close(conn);
	
		return loginUser;
	}
	
	
	public int insertMember(Member mem) {
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn, mem);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	
	
	}
	
	
	public Member selectMember(String userId) {
		Connection conn = getConnection();
		
		Member mem = new MemberDao().selectMember(conn, userId);
		
		close(conn);
		
		return mem;
	}

	

	public Member updatePwdMember(String userId, String userPwd, String newPwd) {
		Connection conn = getConnection();
		
		int result = new MemberDao().updatePwdMember(conn, userId, userPwd, newPwd);
		
		Member updateMem = null;
		
		if(result > 0) {
			commit(conn);
			updateMem = new MemberDao().selectMember(conn, userId);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return updateMem;
	}
	
	
	
}
