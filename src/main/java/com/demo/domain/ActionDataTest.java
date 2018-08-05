package com.demo.domain;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class ActionDataTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testValue() {
		List<Double> d = new ArrayList<>();
		d.add(5.0);
		d.add(1.0);
		d.add(3.0);
		ActionData<Double> data = new ActionData<Double>(d,new SumDoubleAction());
		System.out.println(data.value());
		
	}

}
