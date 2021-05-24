package it.springboot.tutorial.microservizi.dao;

import it.springboot.tutorial.microservizi.dto.UserDTO;
import it.springboot.tutorial.microservizi.utility.Constants;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<UserDTO> getListaUtenti() throws Exception
	{
		String query = "select NOME, COGNOME, CODICE_FISCALE from USER";
		return em.createNativeQuery(query, Constants.GET_LISTA_UTENTI).getResultList();
	}
}
