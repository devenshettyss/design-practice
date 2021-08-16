package com.tcs.creational;

public class Government {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RBI rbi = new RBI();
		RBI rbi = RBI.getInstance();
		RBI rbi1 = RBI.getInstance();
		System.out.println(rbi == rbi1);
		

	}

}
