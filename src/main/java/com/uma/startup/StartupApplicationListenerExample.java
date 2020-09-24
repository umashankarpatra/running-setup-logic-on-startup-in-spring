package com.uma.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListenerExample implements ApplicationListener<ContextRefreshedEvent> {

	Logger logger = LoggerFactory.getLogger(ConstructorInjection.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		logger.info(">>>>> onApplicationEvent method  :: ");

	}

}
