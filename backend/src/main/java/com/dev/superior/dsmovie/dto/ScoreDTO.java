package com.dev.superior.dsmovie.dto;

public class ScoreDTO {
	private Long movieId;
	private String email;
	private Double score;
	
	public ScoreDTO () {
		
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieIdLong(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setSmail(String smail) {
		this.email = smail;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
