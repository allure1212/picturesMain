package com.kh.menubar.controller;

import lombok.Getter;

@Getter
public class TheaterDto {
	private Integer theaterNo;
	private String theaterName;
	
	public TheaterDto(Integer theaterNo, String theaterName) {
		this.theaterNo = theaterNo;
		this.theaterName = theaterName;
	}
}
