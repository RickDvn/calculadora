package com.viewnext.calculadora.operacion;

public class Operacion {
	
	private float num1;
	private float num2;
	private float resultado;
	private char tipo;
	
	public Operacion() {
		super();
	}

	public Operacion(float num1, float num2, float resultado, char tipo) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
		this.tipo = tipo;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String str = "-----------------\n";
		
		str += num1 + " " + tipo + " " + num2 + " = " + resultado + "\n";
		
		str += "-----------------\n";
		return str;
	}
	
}
