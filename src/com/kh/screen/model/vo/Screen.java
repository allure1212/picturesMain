package com.kh.screen.model.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class Screen {
   /* SCREEN_NO */
   private int screenNo;

   /* ROOM_NO */
   private int roomNo;

   /* MOVIE_NO */
   private int movieNo;

   /* SCREEN_DATE */
   private Date screenDate;

}
