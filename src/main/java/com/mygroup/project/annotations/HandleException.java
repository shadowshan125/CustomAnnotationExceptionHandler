package com.mygroup.project.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.mygroup.project.abs.ExHandler;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.SOURCE)
public @interface HandleException {
	public Class<? extends ExHandler> targetCatchHandler();

	public Class<? extends Throwable> catchException() default Exception.class;

}
