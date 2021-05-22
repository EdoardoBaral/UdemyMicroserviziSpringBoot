package it.springboot.tutorial.microservizi.controller;

import it.springboot.tutorial.microservizi.utility.Constants;
import it.springboot.tutorial.microservizi.utility.SampleMessage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@GetMapping(value = "/esempioGet", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage esempioGet()
	{
		SampleMessage response = new SampleMessage();
		response.setStatus(Constants.OK);
		response.setMessage("Primo servizio REST eseguito con successo");
		
		return response;
	}
	
	@GetMapping(value = "/esempioGetPathVariable/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage esempioGetPathVariable(@PathVariable(value = "name") String name)
	{
		SampleMessage response = new SampleMessage();
		response.setStatus(Constants.OK);
		response.setMessage("Il tuo nome è "+ name);
		
		return response;
	}
	
	@GetMapping(value = "/esempioGetRequestParameter/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage esempioGetRequestParameter(@RequestParam(value = "name") String name)
	{
		SampleMessage response = new SampleMessage();
		response.setStatus(Constants.OK);
		response.setMessage("Il tuo nome è "+ name);
		
		return response;
	}
}