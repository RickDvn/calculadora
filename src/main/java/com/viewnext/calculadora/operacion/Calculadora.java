package com.viewnext.calculadora.operacion;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	
	private List<Operacion> historial;
	
	public Calculadora() {
		this.historial = new ArrayList<>();
	}
	
	public int suma(int num1, int num2) {
		return num1 + num2;
	}
	
	public int resta(int num1, int num2) {
		return num1 - num2;
	}
	
	public float dividir(float num1, float num2) {
		if (num2 != 0) {
			return num1 / num2;
		}else {
			throw new IllegalArgumentException("El divisor no puede ser 0");
		}
	}
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public void addToHistorial(Operacion operacion) {
		this.historial.add(operacion);
	}
	
	public String obtenerHistorial() {
		StringBuilder str = new StringBuilder();
		for (Operacion op : historial) {
			str.append(op.toString());
		}
		return str.toString();
	}
	
}
