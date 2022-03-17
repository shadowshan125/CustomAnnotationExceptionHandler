package com.mygroup.project.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Check.class);
	public static void main(String[] args) throws Throwable {
		
		log.info("STARTED ");
		Custom crux = new Custom();
		CustomReader reader = new CustomReader();

		HandlingExceptionValidations.validationCaller(crux, reader);
		log.info("ENDED");
	}
}
