package com.mygroup.project.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.mygroup.project.abs.Caller;
import com.mygroup.project.abs.ExHandler;

public class HandlingExceptionValidations {

	public static void validationCaller(Caller instance, CustomReader reader) throws Throwable {
		System.out.println("Inside validation");
		Method m = instance.getClass().getMethod("callMethod");
		Annotation as[] = m.getAnnotations();
		HandleException[] li = null;
		for (Annotation a : as) {
			if (a.annotationType().equals(HandlerExceptionSet.class)) {
				li = ((HandlerExceptionSet) a).exceptionSet();
			}
		}

		try {
			instance.callMethod();
			instance.callMethod01();
			instance.callMethod02();
			reader.ReadLineByLineExample1();
		} catch (Exception e) {
			Class<?> ec = e.getClass();
			for (HandleException he : li) {
				if (he.catchException().equals(ec)) {
					ExHandler exceptionHandler = he.targetCatchHandler().newInstance();
					exceptionHandler.handleExceptionCheck(e);
					System.out.println("exit validation");
				}
			}
		}
	}
}
