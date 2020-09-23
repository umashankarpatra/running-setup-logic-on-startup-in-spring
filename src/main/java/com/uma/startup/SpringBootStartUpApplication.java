package com.uma.startup;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootStartUpApplication {

	@Autowired
	private RestTemplate restTemplate;

	Logger logger = LoggerFactory.getLogger(SpringBootStartUpApplication.class);

	private static String uri = "http://localhost:9090/newBooks";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartUpApplication.class, args);
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("--->>>>getLatestestBooks >>>>>");

		ResponseEntity<Book[]> result = restTemplate.getForEntity(uri, Book[].class);
		logger.debug("--->>>>>" + result);
		Book[] books = result.getBody();
		if (books != null) {
			for (Book book : books) {
				System.out.println("-->>" + book.toString());
			}
		}
	}

}
