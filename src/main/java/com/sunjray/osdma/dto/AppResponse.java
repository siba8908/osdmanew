package com.sunjray.osdma.dto;

import java.io.Serializable;

public class AppResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;

	public AppResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public String toString() {
		return "AppResponse [message=" + message + "]";
	}

}
