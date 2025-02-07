package com.wipro.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Mario Jumppppp!");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Mario Goes Into Hole");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Mario Moves Back");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Mario Moves Forward");
		
	}

	

}
