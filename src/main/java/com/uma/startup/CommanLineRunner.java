package com.uma.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommanLineRunner implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(CommanLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info(">>>>Spring boot provides a CommanLineRunner interface with a callback run() method which"
				+ " can be invoked at application startup after the Spring application context is " + "instantiated");

	}

}
