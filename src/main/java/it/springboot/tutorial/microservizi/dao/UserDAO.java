package it.springboot.tutorial.microservizi.dao;

import it.springboot.tutorial.microservizi.dto.UserDTO;

import java.util.List;

public interface UserDAO
{
	List<UserDTO> getListaUtenti() throws Exception;
}
