package com.projectweb.random.services.exceptions;

public class ResourcesNotFoundExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourcesNotFoundExceptions(Object id) {
		super("Resource not found. id: "+id);
	} 
}
