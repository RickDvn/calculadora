package com.viewnext.calculadora.operacion;

/**
 * Clase para guardar las opercaciones que se realizan en la aplicación,
 * soporta operaciones simples de dos numeros
 */
public class Operacion {
	
	private float num1;
	private float num2;
	private float resultado;
	private char tipo;
	
	/**
	 * Constructor por defecto
	 */
	public Operacion() {
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param num1
	 * @param num2
	 * @param resultado
	 * @param tipo
	 */
	public Operacion(float num1, float num2, float resultado, char tipo) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
		this.tipo = tipo;
	}

	/**
	 * @return el float num1
	 */
	public float getNum1() {
		return num1;
	}

	/**
	 * @param float num1
	 */
	public void setNum1(float num1) {
		this.num1 = num1;
	}

	/**
	 * @return el float num2
	 */
	public float getNum2() {
		return num2;
	}

	/**
	 * @param floatnum2
	 */
	public void setNum2(float num2) {
		this.num2 = num2;
	}

	/**
	 * @return el float resultado
	 */
	public float getResultado() {
		return resultado;
	}

	/**
	 * @param float resultado
	 */
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return el char tipo
	 */
	public char getTipo() {
		return tipo;
	}

	/**
	 * @param char tipo
	 */
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	/**
	 * El toString() formateado de las operaciones
	 */
	@Override
	public String toString() {
		String str = "-----------------\n";
		
		str += num1 + " " + tipo + " " + num2 + " = " + resultado + "\n";
		
		str += "-----------------\n";
		return str;
	}
	
}
