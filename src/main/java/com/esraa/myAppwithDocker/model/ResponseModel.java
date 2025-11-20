package com.esraa.myAppwithDocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseModel {
	
	
	String statusCode ;
	Object data ;
	String message ;
	
	
	
	

}
