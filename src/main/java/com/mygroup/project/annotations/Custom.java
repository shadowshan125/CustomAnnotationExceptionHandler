package com.mygroup.project.annotations;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mygroup.project.abs.Caller;

public class Custom implements Caller {
	private static final Logger log = LoggerFactory.getLogger(Custom.class);

	@Override
	@HandlerExceptionSet(exceptionSet = {
			@HandleException(targetCatchHandler = Check.class, catchException = ArithmeticException.class),
			@HandleException(targetCatchHandler = Check.class, catchException = NullPointerException.class) })
	public void callMethod01() throws IOException {
		log.info("Processing Call Method 01");
		int a = 13, b = 555;
		System.out.println("The value is:" + b / a);
	}

	@Override
	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
	public void callMethod02() throws IOException {
		log.info("Processing Call Method 02");

		// NullPointerException

		Integer number = 1;
		if (number > 0) {
			System.out.println("Positive number");
		}
	}

	@Override
	@HandleException(targetCatchHandler = Check.class, catchException = Exception.class)
	public void callMethod03() throws IOException {
		log.info("Processing Call Method 03");
		// ArithmeticException

		int a = 0, b = 10;
		System.out.println("The value is:" + b / a);

	}

}
