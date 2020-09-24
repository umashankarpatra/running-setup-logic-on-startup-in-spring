package com.uma.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner{
	
	Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info(">>> ApplicationRunner example .... ");
		logger.info(">>>> ApplicationArguments :: "+args.getOptionNames());
		
	}

}
