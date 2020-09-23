package com.uma.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

	Logger logger = LoggerFactory.getLogger(ConstructorInjection.class);

	public ConstructorInjection() {
		logger.info("--->>>>ConstructorInjection >>>>>");

	}

}
