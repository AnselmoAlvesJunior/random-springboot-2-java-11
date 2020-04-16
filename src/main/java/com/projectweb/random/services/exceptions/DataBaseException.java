package com.projectweb.random.services.exceptions;

import org.springframework.dao.DataAccessException;

public class DataBaseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DataBaseException(String msg) {
		super(msg);
	}
}
