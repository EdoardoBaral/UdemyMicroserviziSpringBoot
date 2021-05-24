package it.springboot.tutorial.microservizi.utility;

import lombok.Data;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;

@Data
@ToString
public class SampleMessage
{
	private String status;
	private String message;
	
	public SampleMessage()
	{
		status = Constants.OK;
	}
	
	public HttpStatus getHttpStatus(HttpServletRequest request)
	{
		String reqMethod = request.getMethod();
		if(Constants.OK.equals(this.getStatus()))
		{
			if(reqMethod.contentEquals(Constants.POST))
				return HttpStatus.CREATED;
			else
				return HttpStatus.OK;
		}
		else if(this.getStatus().contentEquals(Constants.NO_CONTENT))
			return HttpStatus.NO_CONTENT;
		else
			return HttpStatus.BAD_REQUEST;
	}
}
