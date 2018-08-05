package com.demo.domain;

import java.util.Collection;

public interface Action<T>{
	
	T calc(Collection<T> list);
}
