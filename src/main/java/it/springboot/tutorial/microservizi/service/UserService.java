package it.springboot.tutorial.microservizi.service;

import it.springboot.tutorial.microservizi.utility.SampleMessage;

public interface UserService
{
	SampleMessage getListaUtenti() throws Exception;
	SampleMessage getListaUtentiDatabase() throws Exception;
	SampleMessage cercaUtenteDatabase(int idUtente) throws Exception;
	SampleMessage salvaUtente(String nome, String cognome, String codiceFiscale) throws Exception;
	SampleMessage salvaAggiornaUtente(String nome, String cognome, String codiceFiscale) throws Exception;
}
