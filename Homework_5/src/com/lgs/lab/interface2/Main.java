package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator();
		
		System.out.println("Додавання чисел: " + calculator.plus(5, 12));
		System.out.println("Віднімання чисел: " + calculator.minus(52, 24));
		System.out.println("Множення чисел: " + calculator.multiply(7, 2.5));
		System.out.println("Ділення чисел: " + calculator.devide(125, 4));
	}

}
