package it.springboot.tutorial.microservizi.entity;

import it.springboot.tutorial.microservizi.dto.UserDTO;
import it.springboot.tutorial.microservizi.utility.Constants;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "EntityMapper")
@Table(name = "USER")
@SqlResultSetMapping(name = Constants.GET_LISTA_UTENTI,
					classes = {@ConstructorResult(targetClass = UserDTO.class,
												  columns = {@ColumnResult(name = "NOME"), @ColumnResult(name = "COGNOME"), @ColumnResult(name = "CODICE_FISCALE")})})
@Data
@ToString
public class EntityMapper implements Serializable
{
	@Id
	@Column(name = "ID")
	private int id;
}
