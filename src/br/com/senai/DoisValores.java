package br.com.senai;

import java.util.Scanner;

public class DoisValores {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int primeiroValor = tec.nextInt();
		System.out.println("Informe o segundo valor: ");
		int segundoValor = tec.nextInt();
		int pares = 0;
		int impares = 0;
		System.out.println("--- Sequ�ncia de valores ---");
		
		if (primeiroValor == segundoValor) {
			System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia.");
		} else if (primeiroValor > segundoValor) {
			while (segundoValor <= primeiroValor) {
				if (primeiroValor % 2 == 0) {
					pares++;
				}
			else {
					impares++;
				}
				System.out.println(primeiroValor);
				primeiroValor -= 1;
			}
		} else if (primeiroValor < segundoValor) {
			while (primeiroValor <= segundoValor) {
				if (primeiroValor % 2 == 0) {
					pares++;
				}
			else {
					impares++;
				}
				System.out.println(primeiroValor);
				primeiroValor += 1;
			}
		}
		System.out.println("--- Contagem de Valores ---");
		System.out.println("N�meros �mpares: "+ pares);
		System.out.println("N�meros �mpares: "+ impares);		

	}

}
