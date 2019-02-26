package com.steven;

public class Alpha {
	
	protected String google;
	int score;
	public Alpha(String google, int score) {
		this.google = google;
		this.score = score;
	}
	public void print() {
		System.out.println(google + " score is " + score);   
	}
	
	public void setScore(int score) {
		if(score >= 100 && score<= 0) {
			this.score = score;
		}
	}
	
	
}
