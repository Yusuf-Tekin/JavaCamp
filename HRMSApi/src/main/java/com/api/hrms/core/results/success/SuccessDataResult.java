package com.api.hrms.core.results.success;

import com.api.hrms.core.results.Result;

public class SuccessDataResult<T> extends Result{
	
	private T data;

	public SuccessDataResult() {
		super(true);
		// TODO Auto-generated constructor stub
	}
	
	public SuccessDataResult(String message) {
		super(true,message);
	}
	
	public SuccessDataResult(String message,T data) {
		super(true,message);
		this.data = data;
	}
	

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
	

}
