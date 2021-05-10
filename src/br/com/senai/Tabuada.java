package br.com.senai;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int valor = tec.nextInt();
		int multiplicador = 0;
		System.out.println("--- Tabuada de "+ valor +" ---");
		
		while(multiplicador <= 10) {
			System.out.println(valor +" x "+ multiplicador +" = "+ valor*multiplicador);
			multiplicador++;
		} System.out.println("--------------------");

	}

}
