package it.springboot.tutorial.microservizi.controller;

import it.springboot.tutorial.microservizi.service.UserService;
import it.springboot.tutorial.microservizi.utility.Constants;
import it.springboot.tutorial.microservizi.utility.SampleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class UserController
{
	@Autowired
	private UserService userService;
	
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
	
	@GetMapping(value = "/listaUtenti", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage listaUtenti()
	{
		SampleMessage response = new SampleMessage();
		try
		{
			response = userService.getListaUtenti();
		}
		catch(Exception ex)
		{
			response.setStatus(Constants.KO);
			response.setMessage(ex.getMessage());
		}
		
		return response;
	}
	
	@GetMapping(value = "/listaUtentiDatabase", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage listaUtentiDatabase()
	{
		SampleMessage response = new SampleMessage();
		try
		{
			response = userService.getListaUtentiDatabase();
		}
		catch(Exception ex)
		{
			response.setStatus(Constants.KO);
			response.setMessage(ex.getMessage());
		}
		
		return response;
	}
	
	@GetMapping(value = "/cercaUtenteDatabase/{idUtente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage cercaUtenteDatabase(@PathVariable(value = "idUtente") int idUtente)
	{
		SampleMessage response = new SampleMessage();
		try
		{
			response = userService.cercaUtenteDatabase(idUtente);
		}
		catch(Exception ex)
		{
			response.setStatus(Constants.KO);
			response.setMessage(ex.getMessage());
		}
		
		return response;
	}
	
	@PutMapping(value = "/salvaUtente", produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleMessage salvaUtente(@RequestParam(value = "nome") String nome,
									 @RequestParam(value = "cognome") String cognome,
									 @RequestParam(value = "codiceFiscale") String codiceFiscale)
	{
		SampleMessage response = new SampleMessage();
		try
		{
			response = userService.salvaUtente(nome, cognome, codiceFiscale);
		}
		catch(Exception ex)
		{
			response.setStatus(Constants.KO);
			response.setMessage(ex.getMessage());
		}
		
		return response;
	}
	
	@PutMapping(value = "/salvaAggiornaUtente", produces = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	public SampleMessage salvaAggiornaUtente(@RequestParam(value = "nome") String nome,
									 @RequestParam(value = "cognome") String cognome,
									 @RequestParam(value = "codiceFiscale") String codiceFiscale)
	{
		SampleMessage response = new SampleMessage();
		try
		{
			response = userService.salvaAggiornaUtente(nome, cognome, codiceFiscale);
		}
		catch(Exception ex)
		{
			response.setStatus(Constants.KO);
			response.setMessage(ex.getMessage());
		}
		
		return response;
	}
}
