package com.mygroup.project.annotations;

import com.mygroup.project.abs.ExHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Check implements ExHandler {// the class who handles the exception
	private static final Logger log = LoggerFactory.getLogger(Check.class);

	@Override
	public void handleExceptionCheck(Exception e) {
		
		log.info("checking.... " ,e.getMessage() , e.getClass().getName() );
		
	}
}
