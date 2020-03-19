package com.kh.movie.model.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
	/* MOVIE_NO */
	private int movieNo;

	/* TITLE */
	private String title;

	/* RUNTIME */
	private int runtime;

	/* DIRECTOR */
	private String director;

	/* ACTOR */
	private String actor;

	/* AGE_LIMIT */
	private int ageLimit;

	/* SYNOPSIS */
	private String synopsis;

	/* ON_DATE */
	private Object onDate;

	/* STATUS */
	private String status;

	public Movie(int movieNo, String title, int ageLimit) {
		super();
		this.movieNo = movieNo;
		this.title = title;
		this.ageLimit = ageLimit;
	}

	public boolean isEquals(Integer movieNo) {
		if (movieNo == null) {
			return false;
		}
		return this.movieNo == movieNo.intValue();
	}
}
