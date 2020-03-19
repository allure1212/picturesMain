package com.kh.menubar.controller;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class SectionDto {
	private Integer sectionNo;
	private String sectionName;
	
	private List<TheaterDto> theaters;
	
	public SectionDto(Integer sectionNo, String sectionName) {
		this(sectionNo, sectionName, new ArrayList<>());
	}
	
	public SectionDto(Integer sectionNo, String sectionName, List<TheaterDto> theaters) {
		this.sectionNo = sectionNo;
		this.sectionName = sectionName;
		this.theaters = theaters;
	}
	
	public void addTheaterDto(TheaterDto theaterDto) {
		this.theaters.add(theaterDto);
	}
}

