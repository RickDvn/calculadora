package com.viewnext.calculadora.operacion;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase que maneja las operaciones y el historial las que se han ido haciendo
 */
public class Calculadora {
	
	private List<Operacion> historial;
	
	/**
	 * Constructor por defecto que inicializa el List de operaciones (historial)
	 */
	public Calculadora() {
		this.historial = new ArrayList<>();
	}
	
	/**
	 * Introduces dos numeros y te devuelve su suma
	 * 
	 * @param int num1
	 * @param int num2
	 * @return Un int, el resultado de la suma
	 */
	public int suma(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * Introduces dos numeros y te devuelve su resta
	 * 
	 * @param int num1
	 * @param int num2
	 * @return Un int, el resultado de la resta
	 */
	public int resta(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * Introduces dos numeros y te devuelve su division
	 * 
	 * @param float num1
	 * @param float num2
	 * @return Un float, el resultado de la division
	 */
	public float dividir(float num1, float num2) {
		if (num2 != 0) {
			return num1 / num2;
		}else {
			throw new IllegalArgumentException("El divisor no puede ser 0");
		}
	}
	
	/**
	 * Introduces dos numeros y te devuelve su multiplicacion
	 * 
	 * @param flaot num1
	 * @param float num2
	 * @return Un float, el resultado de la multiplicacion
	 */
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * añade una operacion realizada al historial del objeto
	 * 
	 * @param Operacion operacion
	 */
	public void addToHistorial(Operacion operacion) {
		this.historial.add(operacion);
	}
	
	/**
	 * Te devuelve el historial completo de operaciones que se han añadido
	 * 
	 * @return String historial
	 */
	public String obtenerHistorial() {
		StringBuilder str = new StringBuilder();
		for (Operacion op : historial) {
			str.append(op.toString());
		}
		return str.toString();
	}
	
}
