package it.springboot.tutorial.microservizi.service;

import it.springboot.tutorial.microservizi.entity.User;
import it.springboot.tutorial.microservizi.utility.Constants;
import it.springboot.tutorial.microservizi.utility.SampleMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
	@Override
	public SampleMessage getListaUtenti() throws Exception
	{
		SampleMessage response = new SampleMessage();
		List<String> listaNomiUtenti = new ArrayList<>();
		
		User user1 = new User("Nando", "Martellone", "MRTNND91R13L219P");
		User user2 = new User("Karin", "Proia", "PRIKRN91R13L219P");
		listaNomiUtenti.add(user1.getNome());
		listaNomiUtenti.add(user2.getNome());
		
		response.setStatus(Constants.OK);
		response.setMessage(listaNomiUtenti.toString());
		
		return response;
	}
}
