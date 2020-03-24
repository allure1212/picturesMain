package com.kh.reserved.controller;

import static com.kh.common.isInteger.isInteger;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.mem_code.model.service.MemCodeService;
import com.kh.mem_code.model.vo.MemCodes;
import com.kh.still_image.model.service.StillImageService;

@WebServlet("/reservedFour.do")
public class ReservedFourView extends HttpServlet {

 
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 기본값 세팅 말고 사용자에게 잘못된 요청임을 알림
		String sectionNo = request.getParameter("sectionNo");
		String theaterNo = request.getParameter("theaterNo");
		String movieNo = request.getParameter("movieNo");
		String screenNo = request.getParameter("screenNo");
		
	
		if(!isInteger(request.getParameter("sectionNo")) || !isInteger(request.getParameter("theaterNo"))
				|| !isInteger(request.getParameter("movieNo")) ||!isInteger(request.getParameter("screenNo"))) {
			request.getRequestDispatcher("views/reserved/reservedOneView.jsp").forward(request, response);
			return;
		}
		
		MemCodes memCodes = new MemCodes(new MemCodeService().selectAll());
		String mainPoster = new StillImageService().selectMain(movieNo);
			
		request.setAttribute("sectionNo", sectionNo);
		request.setAttribute("theaterNo", theaterNo);
		request.setAttribute("movieNo", movieNo);
		request.setAttribute("screenNo", screenNo);
		request.setAttribute("memCode", memCodes.getMemCodes());
		request.setAttribute("mainPoster", mainPoster);
		request.setAttribute("adultCost", memCodes.findCostByType("ADULT"));
		request.setAttribute("youthCost", memCodes.findCostByType("YOUTH"));
		request.setAttribute("seniorCost", memCodes.findCostByType("SENIOR"));
		request.setAttribute("disabledCost", memCodes.findCostByType("DISABLED"));

		request.getRequestDispatcher("views/reserved/reservedFourView.jsp").forward(request, response);
	
	}


}
