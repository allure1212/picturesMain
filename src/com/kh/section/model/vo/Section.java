package com.kh.section.model.vo;


public class Section {
	private Integer sectionNo;
	private String name;
	public Integer getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(Integer sectionNo) {
		this.sectionNo = sectionNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Section(Integer sectionNo, String name) {
		super();
		this.sectionNo = sectionNo;
		this.name = name;
	}



}
