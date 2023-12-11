package com.learn.springboot.learnspringboot;

import org.testng.annotations.Test;

public class Implement {
	
	int x = 10;
	
	public static void main(String[] args) {
		Implement i = new Implement();
		i.z(30);
		System.out.println(i.toString());
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}	

	
	public  void z(int x) {
		System.out.println("X :: "+x);
		System.out.println(this.x);
		this.x = x ;
		x = 20;
		System.out.println(x);
		System.out.println(this.x);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this.x value : " +this.x+"x :: "+x;
	}

}
