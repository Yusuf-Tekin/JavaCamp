package com.api.hrms.core.results;

public class Result<T> {
	
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success; // Success bilgisi zorunlu ancak mesaj bilgisi zorunlu değil.
	}
	
	public Result(boolean success,String message) {
		this(success);// Success bilgisi zorunlu ancak mesaj bilgisi zorunlu değil.
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
