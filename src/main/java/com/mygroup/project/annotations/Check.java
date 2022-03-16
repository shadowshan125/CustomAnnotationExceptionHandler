package com.mygroup.project.annotations;

import com.mygroup.project.abs.ExHandler;

public class Check implements ExHandler {// the class who handles the exception
	@Override
	public void handleExceptionCheck(Exception e) {
		System.out.println("checking....");
		System.out.println(e.getMessage());
		System.out.println(e.getClass().getName());
	}
}
