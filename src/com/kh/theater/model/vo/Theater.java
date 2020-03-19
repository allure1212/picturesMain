package com.kh.theater.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Theater {
   /* THEATER_NO */
   private int theaterNo;

   /* NAME */
   private String name;

   /* ADDRESS */
   private String address;

   /* PHONE */
   private String phone;

/* ROOM_COUNT */
   private int roomCount;

   /* TRANSPORT */
   private String transport;

   /* PARKING */
   private String parking;

   /* LONGITUDE */
   private int longitude;

   /* LATITUDE */
   private int latitude;
   
   /* SECTION_NO */
   private int sectionNo;

   
   public Theater(int theaterNo, String name, String address, String phone, int roomCount, String transport,
		   String parking, int longitude, int latitude, int sectionNo) {
	   this.theaterNo = theaterNo;
	   this.name = name;
	   this.address = address;
	   this.phone = phone;
	   this.roomCount = roomCount;
	   this.transport = transport;
	   this.parking = parking;
	   this.longitude = longitude;
	   this.latitude = latitude;
	   this.sectionNo = sectionNo;
   }
}
