package it.springboot.tutorial.microservizi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * IMPORTANTE!! La classe del main deve essere collocata un package al di sopra delle altre classi di codice sorgente
 * altrimenti SpringBoot non riesce a scansionare correttamente il progetto in cerca dei componenti e si ottiene un
 * errore 404 alla chiamata delle API Rest
 */

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
