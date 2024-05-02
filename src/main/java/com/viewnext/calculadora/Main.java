package com.viewnext.calculadora;

import java.util.Scanner;

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

	public static void menuCalculadora() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\t1-Sumar\n" + "\t2-Restar\n" + "\t3-Dividir\n" + "\t4-Multiplicar\n" + "\t-1-Salir\n");
		System.out.println("-----------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		int opc, num1 = 1, num2 = 1;
		float resultado = 0f;
		boolean salirPrograma = false;
		do {
			menuCalculadora();

			// Pedir opcion
			try {
				opc = pedirInt();
			} catch (IllegalArgumentException ex) {
				opc = 0;
			}

			if (opc != -1) {

				// Pedir numeros
				try {
					num1 = pedirInt();
					num2 = pedirInt();
				} catch (Exception e) {
					opc = 0;
				}

				// Operaciones
				if (opc == 1) {
					resultado = Operaciones.suma(num1, num2);
				}

				if (opc == 2) {
					resultado = Operaciones.resta(num1, num2);
				}

				if (opc == 3) {
					try {
						resultado = Operaciones.dividir(num1, num2);
					} catch (IllegalArgumentException e) {
						System.out.println("El divisor no puede ser 0");
						opc = 0;
					}
				}

				if (opc == 4) {
					resultado = Operaciones.multiplicar(num1, num2);
				}

				if (opc != 0) {
					System.out.println("El resultado de la operacion es: " + resultado);
				}
			}else{
				salirPrograma = true;
			} 

		}while(!salirPrograma);
}

}
