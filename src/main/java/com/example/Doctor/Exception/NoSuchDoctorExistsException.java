package com.example.Doctor.Exception;

public class NoSuchDoctorExistsException extends RuntimeException {
	
private String message;
	
	public NoSuchDoctorExistsException() {}
	
	public NoSuchDoctorExistsException(String msg)
	{
		super(msg);
		this.message = msg;
	}

}
