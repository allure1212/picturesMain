package com.kh.theater.model.dao;

import java.util.Date;

import lombok.Getter;

@Getter
public class RoomDto {

	private Integer roomNo;
	private String roomName;
	private Date screenDate;
	
	public RoomDto(Integer roomNo, String roomName, Date screenDate) {
		super();
		this.roomNo = roomNo;
		this.roomName = roomName;
		this.screenDate = screenDate;
	}
	
}
