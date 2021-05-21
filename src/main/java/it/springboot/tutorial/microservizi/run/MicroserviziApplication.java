package it.springboot.tutorial.microservizi.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroserviziApplication extends SpringBootServletInitializer
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviziApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(MicroserviziApplication.class);
	}
}
