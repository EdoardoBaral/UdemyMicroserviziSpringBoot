package it.springboot.tutorial.microservizi.service;

import it.springboot.tutorial.microservizi.entity.User;
import it.springboot.tutorial.microservizi.repository.UserRepository;
import it.springboot.tutorial.microservizi.utility.Constants;
import it.springboot.tutorial.microservizi.utility.SampleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
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
	
	@Override
	public SampleMessage getListaUtentiDatabase() throws Exception
	{
		SampleMessage response = new SampleMessage();
		List<User> listaUtenti = userRepository.findAll();
		List<String> listaNomi = new ArrayList<>();
		
		for(User user : listaUtenti)
			listaNomi.add(user.getNome());
		
		response.setStatus(Constants.OK);
		response.setMessage(listaNomi.toString());
		
		return response;
	}
	
	@Override
	public SampleMessage cercaUtenteDatabase(int idUtente) throws Exception
	{
		SampleMessage response = new SampleMessage();
		Optional<User> user = userRepository.findById(idUtente);
		
		response.setStatus(Constants.OK);
		response.setMessage(user.get().toString());
		
		return response;
	}
}
