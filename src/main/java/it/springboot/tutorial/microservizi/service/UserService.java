package it.springboot.tutorial.microservizi.service;

import it.springboot.tutorial.microservizi.utility.SampleMessage;

public interface UserService
{
	SampleMessage getListaUtenti() throws Exception;
	SampleMessage getListaUtentiDatabase() throws Exception;
	SampleMessage cercaUtenteDatabase(int idUtente) throws Exception;
}
