package br.dev.gspadilha.basejavaspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.dev.gspadilha")
public class BaseJavaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseJavaSpringBootApplication.class, args);
	}

}
