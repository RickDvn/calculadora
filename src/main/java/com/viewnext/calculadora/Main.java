package com.viewnext.calculadora;

import java.lang.System.Logger;
import java.util.Scanner;

import com.viewnext.calculadora.operacion.Operacion;
import com.viewnext.calculadora.operacion.Calculadora;

public class Main {

	public static int pedirInt() {
		Scanner es = new Scanner(System.in);
		int num;
		try {
			num = es.nextInt();
			return num;
		} catch (Exception e) {
			throw new IllegalArgumentException("Solo caracteres numericos");
		}
	}

	public static void menuCalculadora(Logger logger) {
		logger.log(System.Logger.Level.INFO, "-----------------------------------------------------------------------\n" + "\t1-Sumar\n"
											+ "\t2-Restar\n" + "\t3-Dividir\n" + "\t4-Multiplicar\n" + "\t5-Historial\n" + "\t-1-Salir\n"
											+ "-----------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Logger logger = System.getLogger("LogCalc");
		Calculadora calculadora = new Calculadora();
		int opc;
		int num1;
		int num2;
		float resultado = 0;
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
				try {
					logger.log(System.Logger.Level.INFO, "1mer numero");
					num1 = pedirInt();
					logger.log(System.Logger.Level.INFO, "2do numero");
					num2 = pedirInt();
					resultado = calculadora.suma(num1, num2);
					calculadora.addToHistorial(new Operacion(num1, num2, resultado, '+'));
				}catch (IllegalArgumentException e){
					logger.log(System.Logger.Level.ERROR, "DEBES PONER LOS DOS NUMEROS");
				}
				break;
				
			case 2:
				try {
					logger.log(System.Logger.Level.INFO, "1mer numero");
					num1 = pedirInt();
					logger.log(System.Logger.Level.INFO, "2do numero");
					num2 = pedirInt();
					resultado = calculadora.resta(num1, num2);
					calculadora.addToHistorial(new Operacion(num1, num2, resultado, '-'));
				}catch (IllegalArgumentException e){
					logger.log(System.Logger.Level.ERROR, "DEBES PONER LOS DOS NUMEROS");
				}
				break;
				
			case 3:
				try {
					logger.log(System.Logger.Level.INFO, "1mer numero");
					num1 = pedirInt();
					logger.log(System.Logger.Level.INFO, "2do numero");
					num2 = pedirInt();
					resultado = calculadora.dividir(num1, num2);
					calculadora.addToHistorial(new Operacion(num1, num2, resultado, '/'));
				}catch (IllegalArgumentException e){
					logger.log(System.Logger.Level.ERROR, "DEBES PONER LOS DOS NUMEROS");
				}
				break;
				
			case 4:
				try {
					logger.log(System.Logger.Level.INFO, "1mer numero");
					num1 = pedirInt();
					logger.log(System.Logger.Level.INFO, "2do numero");
					num2 = pedirInt();
					resultado = calculadora.multiplicar(num1, num2);
					calculadora.addToHistorial(new Operacion(num1, num2, resultado, '*'));
				}catch (IllegalArgumentException e){
					logger.log(System.Logger.Level.ERROR, "DEBES PONER LOS DOS NUMEROS");
				}
				break;
				
			case 5:
				logger.log(System.Logger.Level.INFO, calculadora.obtenerHistorial());
				break;

			case -1:
				salirPrograma = true;
				break;
				
			default:
				logger.log(System.Logger.Level.INFO, "Opcion no valida");
				resultado = 0;
				break;
			}
			
			if (!salirPrograma) {
				logger.log(System.Logger.Level.INFO, "El resultado de la operacion es: " + resultado);
			}
		} while (!salirPrograma);
	}

}
