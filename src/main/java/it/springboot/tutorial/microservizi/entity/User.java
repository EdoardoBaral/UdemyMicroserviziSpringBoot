package it.springboot.tutorial.microservizi.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User
{
	private int id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public User()
	{ }
	
	public User(String nome, String cognome, String codiceFiscale)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
}
