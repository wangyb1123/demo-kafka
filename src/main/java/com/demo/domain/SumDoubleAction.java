package com.demo.domain;

import java.util.Collection;

public class SumDoubleAction implements Action<Double>{

	public Double calc(Collection<Double> list) {
		return list.stream().mapToDouble(e-> e.doubleValue()).sum();
	}

}
