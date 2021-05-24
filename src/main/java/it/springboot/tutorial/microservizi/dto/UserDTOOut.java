package it.springboot.tutorial.microservizi.dto;

import it.springboot.tutorial.microservizi.utility.SampleMessage;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class UserDTOOut
{
	private SampleMessage status;
	private List<UserDTO> userList;
	
	public UserDTOOut()
	{
		status = new SampleMessage();
		userList = new ArrayList<>();
	}
	
	public UserDTOOut(SampleMessage status, List<UserDTO> userList)
	{
		this.status = status;
		this.userList = userList;
	}
}
