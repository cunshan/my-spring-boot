package com.example;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		List<Class> list = new ArrayList<>();
		list.add(MySpringBootApplication.class);
		list.add(MyBean1.class);
		list.add(MyBean2.class);
		SpringApplication.run(list.toArray(), args);
	}
}
