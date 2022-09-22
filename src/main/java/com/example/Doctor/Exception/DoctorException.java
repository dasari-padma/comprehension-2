package com.example.Doctor.Exception;

public class DoctorException extends Exception{
	
	private static final Long serialVersionUID = 1L;
	
	@Override
	public String getMessage() 
	{
		return "Id already exists in dstabase";
	}

}
