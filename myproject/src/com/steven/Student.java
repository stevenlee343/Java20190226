package com.steven;

public class Student {

	protected String name;
	int english;
	public Student(String name, int english) {
		this.name = name;
		this.english = english;
	}
	public void print() {
		System.out.println(name + "\t" + english);   
	}
	
	public void setEnglish(int a) {
		if(a >= 100 && a<= 0) {
			this.english = english;
		}
	}
	
	
}
