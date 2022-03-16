package com.mygroup.project.annotations;

import java.io.IOException;

import com.mygroup.project.abs.Caller;

public class Custom implements Caller {
	@Override
	@HandlerExceptionSet(exceptionSet = {
			@HandleException(targetCatchHandler = Check.class, catchException = ArithmeticException.class),
			@HandleException(targetCatchHandler = Check.class, catchException = NullPointerException.class) })
	public void callMethod() throws Throwable {
		System.out.println("Inside method 1");
		int a = 13, b = 555;
		System.out.println("The value is:" + b / a);
	}

	@Override
	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
	public void callMethod01() throws IOException {
		System.out.println("Inside method 2");

		// NullPointerException

		Integer number = 1;
		if (number > 0) {
			System.out.println("Positive number");
		}

	}

	@Override
	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
	public void callMethod02() throws IOException {
		System.out.println("Inside method 3");
		// ArithmeticException

		int a = 01, b = 10;
		System.out.println("The value is:" + b / a);

	}

}
