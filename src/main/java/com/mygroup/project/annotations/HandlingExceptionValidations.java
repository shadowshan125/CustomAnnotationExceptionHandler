package com.mygroup.project.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mygroup.project.abs.Caller;
import com.mygroup.project.abs.ExHandler;
import com.mygroup.project.abs.FileCaller;

public class HandlingExceptionValidations {
	private static final Logger log = LoggerFactory.getLogger(HandlingExceptionValidations.class);

	public static void validationCaller(Caller instance, FileCaller reader) throws Throwable {
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
			reader.ReadLineByLineExample1();
			instance.callMethod01();
			instance.callMethod02();
			instance.callMethod03();
			
		} catch (Exception e) {
			Class<?> ec = e.getClass();
			if (li == null) {
				return;
			}
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
