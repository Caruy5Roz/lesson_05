package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public double plus(double x, double y) {
		return x + y;
	}

	@Override
	public double minus(double x, double y) {
		return x - y;
	}

	@Override
	public double multiply(double x, double y) {
		return x * y;
	}

	@Override
	public double devide(double x, double y) {
		return x / y;
	}


}
