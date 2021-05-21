package it.springboot.tutorial.microservizi.utility;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SampleMessage
{
	private String status;
	private String message;
}
