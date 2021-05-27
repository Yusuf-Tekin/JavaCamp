package com.api.hrms.core.results.error;

import com.api.hrms.core.results.Result;

public class ErrorDataResult<T> extends Result<T>{
	
	private T data;

	public ErrorDataResult() {
		super(false);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDataResult(String message) {
		super(false,message);
	}
	
	public ErrorDataResult(String message,T data) {
		super(false,message);
		this.data = data;
	}
	

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
	

}
