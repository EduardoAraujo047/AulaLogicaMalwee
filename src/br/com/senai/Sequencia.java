package br.com.senai;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int primeiroValor = tec.nextInt();
		System.out.println("Informe o segundo valor: ");
		int segundoValor = tec.nextInt();
		System.out.println("--- Sequência de valores ---");
		
		if (primeiroValor == segundoValor) {
			System.out.println("Valor igual ao primeiro, impossível imprimir a sequência.");
		} else if (primeiroValor > segundoValor) {
			while (segundoValor <= primeiroValor) {
				System.out.println(primeiroValor);
				primeiroValor -= 1;
			}
		} else if (primeiroValor < segundoValor) {
			while (primeiroValor <= segundoValor) {
				System.out.println(primeiroValor);
				primeiroValor += 1;
			}
		} System.out.println("-----------FIM--------------");
			
	}

}
