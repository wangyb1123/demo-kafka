package com.demo.domain;

import java.util.List;

public class MetaData<K,V> {
	List<Element> data;
	
	class Element{
		K key;
		List<V> value;
		Action<V> action;
		V calc(){
			return action.calc(value);
		}
	}
}
