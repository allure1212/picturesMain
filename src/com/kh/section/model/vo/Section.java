package com.kh.section.model.vo;


public class Section {
	private Integer sectionNo;
	private String name;
<<<<<<< HEAD
	
	public Section() {
		
	}

	public Section(Integer sectionNo, String name) {
		super();
		this.sectionNo = sectionNo;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Section [sectionNo=" + sectionNo + ", name=" + name + "]";
	}
=======
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



>>>>>>> 2bad16c725c500255ae3cf11858b4002c23bca23
}
