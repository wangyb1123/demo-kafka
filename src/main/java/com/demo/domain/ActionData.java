package com.demo.domain;

import java.util.List;

public class ActionData<T> {
	List<T> data;
	Action<T> action;
	
	public ActionData(List<T> data, Action<T> action) {
		super();
		this.data = data;
		this.action = action;
	}



	T value(){
		return action.calc(data);
	}
}
