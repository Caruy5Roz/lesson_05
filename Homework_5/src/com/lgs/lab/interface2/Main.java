package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator();
		
		System.out.println("��������� �����: " + calculator.plus(5, 12));
		System.out.println("³������� �����: " + calculator.minus(52, 24));
		System.out.println("�������� �����: " + calculator.multiply(7, 2.5));
		System.out.println("ĳ����� �����: " + calculator.devide(125, 4));
	}

}
