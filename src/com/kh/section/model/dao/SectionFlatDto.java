package com.kh.section.model.dao;

import lombok.Getter;

@Getter
public class SectionFlatDto {
	
	private Integer sectionNo;
	private String sectionName;
	private Integer theaterNo;
	private String theaterName;
	
	public SectionFlatDto(Integer sectionNo, String sectionName, Integer theaterNo, String theaterName) {
		this.sectionNo = sectionNo;
		this.sectionName = sectionName;
		this.theaterNo = theaterNo;
		this.theaterName = theaterName;
	}
}