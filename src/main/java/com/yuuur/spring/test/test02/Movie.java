package com.yuuur.spring.test.test02;

public class Movie {
	
	private int rate;
	private String director;
	private int time;
	private String title;
	
	public Movie(int rate, String director, int time, String title) {
		this.rate = rate;
		this.director = director;
		this.time = time;
		this.title = title;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
