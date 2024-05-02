package com.viewnext.calculadora;

import java.lang.System.Logger;
import java.util.Scanner;

import com.viewnext.calculadora.operacion.Operacion;
import com.sun.tools.sjavac.Log.Level;
import com.viewnext.calculadora.operacion.Calculadora;

public class Main {

	public static int pedirInt() {
		Scanner es = new Scanner(System.in);
		int num;
		try {
			num = es.nextInt();
			return num;
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}

	public static void menuCalculadora(Logger logger) {
		logger.log(System.Logger.Level.INFO, "-----------------------------------------------------------------------");
		logger.log(System.Logger.Level.INFO, "\t1-Sumar\n" + "\t2-Restar\n" + "\t3-Dividir\n" + "\t4-Multiplicar\n" + "\t5-Historial\n"
				+ "\t-1-Salir\n");
		logger.log(System.Logger.Level.INFO, "-----------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Logger logger = System.getLogger("LogCalc");
		Calculadora calculadora = new Calculadora();
		int opc;
		int num1 = 1;
		int num2 = 1;
		float resultado;
		boolean salirPrograma = false;
		do {
			menuCalculadora(logger);

			// Pedir opcion
			try {
				opc = pedirInt();
			} catch (IllegalArgumentException ex) {
				opc = 0;
			}

			switch (opc) {
			case 1:
				resultado = calculadora.suma(num1, num2);
				calculadora.addToHistorial(new Operacion(num1, num2, resultado, '+'));
				break;
				
			case 2:
				resultado = calculadora.resta(num1, num2);
				calculadora.addToHistorial(new Operacion(num1, num2, resultado, '+'));
				break;
				
			case 3:
				resultado = calculadora.dividir(num1, num2);
				calculadora.addToHistorial(new Operacion(num1, num2, resultado, '+'));
				break;
				
			case 4:
				resultado = calculadora.multiplicar(num1, num2);
				calculadora.addToHistorial(new Operacion(num1, num2, resultado, '+'));
				break;
				
			case 5:
				System.out.println(calculadora.obtenerHistorial());
				logger.log(System.Logger.Level.INFO, calculadora.obtenerHistorial());
				break;

			case -1:
				salirPrograma = true;
				break;
				
			default:
				logger.log(System.Logger.Level.INFO, "Opcion no valida");
				break;
			}

		} while (!salirPrograma);
	}

}
