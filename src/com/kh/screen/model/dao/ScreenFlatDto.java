package com.kh.screen.model.dao;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ScreenFlatDto {

	private Integer theaterNo;
	private Integer roomNo;
	private String roomName;
	private Integer screenNo;
	private Integer movieNo;
	private String title;
	private Integer ageLimit;
	private Date screenDate;
	
}
