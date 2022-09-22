package com.example.Doctor.Exception;

public class DoctorAlreadyExistsException extends RuntimeException {
	
private String message;
	
	public DoctorAlreadyExistsException() {}
	
	public DoctorAlreadyExistsException(String msg)
	{
		super(msg);
		this.message=msg;	}

}
