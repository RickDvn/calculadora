package com.viewnext.calculadora;

public class Operaciones {
	
	private Operaciones() {
	}
	
	public static int suma(int num1, int num2) {
		return num1+ num2;
	}
	
	public static int resta(int num1, int num2) {
		return num1 - num2;
	}
	
	public static float dividir(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		}else {
			throw new IllegalArgumentException("El divisor no puede ser 0");
		}
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
}
