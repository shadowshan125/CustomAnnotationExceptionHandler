package com.mygroup.project.annotations;

public class Main {

	public static void main(String[] args) throws Throwable {
		Custom crux = new Custom();
		CustomReader reader = new CustomReader();

		HandlingExceptionValidations.validationCaller(crux, reader);
	}
}
