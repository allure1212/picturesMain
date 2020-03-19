package com.kh.movie.model.vo;

import java.util.HashSet;
import java.util.List;

import lombok.Getter;

@Getter
public class Movies {
	private List<Movie> movies;

	public Movies(List<Movie> movies) {
		this.movies = movies;
	}
	
	// 영화 목록에서 영화 제목 찾기
	public String findTitleByNo(Integer movieNo) {
		for(Movie movie: this.movies) {
			if(movie.isEquals(movieNo)) {
				return movie.getTitle();
			}
		}
		return "";
	}
}

// 내부에 필드는 무조건 1개
// 로또
// 중복되지 않는 숫자 6개
// 로직 한곳에 응집

class Lotto {
	private List<Integer> numbers;
	
	public Lotto(List<Integer> numbers) {
		this.numbers = numbers;
		validateNumbers(numbers);
	}
	
	private void validateNumbers(List<Integer> numbers) {
		if(new HashSet(numbers).size() != 6) {
			throw new RuntimeException();
		}
	}
	
}
