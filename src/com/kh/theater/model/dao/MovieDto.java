package com.kh.theater.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.menubar.controller.TheaterDto;

import lombok.Getter;

@Getter
public class MovieDto {

	private Integer movieNo;
	private String title;
	private Integer ageLimit;
	
	private List<RoomDto> rooms;
	
	public MovieDto(Integer movieNo, String title, Integer ageLimit) {
		this(movieNo, title, ageLimit, new ArrayList<>());
	}

	public MovieDto(Integer movieNo, String title, Integer ageLimit, List<RoomDto> rooms) {
		this.movieNo = movieNo;
		this.title = title;
		this.ageLimit = ageLimit;
		this.rooms = rooms;
	}
	
	public void addRoomDto(RoomDto roomDto) {
		this.rooms.add(roomDto);
	}	

}
