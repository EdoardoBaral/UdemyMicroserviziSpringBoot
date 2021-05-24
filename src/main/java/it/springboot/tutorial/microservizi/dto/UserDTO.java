package it.springboot.tutorial.microservizi.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO
{
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public UserDTO()
	{ }
	
	public UserDTO(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
}
