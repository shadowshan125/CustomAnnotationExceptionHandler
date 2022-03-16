package com.mygroup.project.annotations;

import com.mygroup.project.abs.Caller;
import com.mygroup.project.abs.ExHandler;

public class HandlingExceptionValidations {

	public static void validationCaller(Caller instance, CustomReader reader) throws Throwable {
		System.out.println("Inside validation");
		try {
			instance.callMethod01();
			instance.callMethod02();
			reader.ReadLineByLine();
		} catch (Exception e) {
			Class<?> ec = e.getClass();
			HandleException he = null;
			if (he.catchException().equals(ec)) {
				ExHandler exceptionHandler = he.targetCatchHandler().newInstance();
				exceptionHandler.handleExceptionCheck(e);
				System.out.println("exit validation");
			}
		}
	}
}
