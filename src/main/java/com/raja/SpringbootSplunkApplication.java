package com.raja;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
@Slf4j
public class SpringbootSplunkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSplunkApplication.class, args);

		 IntStream.range(1, 100).forEach(value -> log.info("Number" + value * value));
	}

}
