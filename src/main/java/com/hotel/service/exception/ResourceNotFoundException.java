package com.hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("could not found resource in DB");
	}

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
