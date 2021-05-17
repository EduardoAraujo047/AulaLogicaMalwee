package br.com.senai;

import java.util.Scanner;

public class DesafioVetor {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int idade[] = {5, 18, 16, 21, 20, 4, 28, 32};
		
		System.out.println("Idades: ");
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println("-> "+ idade[i]);
	
		}
		String addNovo = "s";
		
		do {
			System.out.println("Informe o index do vetor: ");
			for(int i = 0; i < idade.length; i++) {
				System.out.print(i +" | ");
			}
			int index = tec.nextInt();
			System.out.print("Informe a idade: ");
			idade[index] = tec.nextInt();
			
			System.out.println("Deseja informar uma nova idade? [S/N]");
			addNovo = tec.next();
			
		}
		while(addNovo.equals("s"));
		
		System.out.println("Vetor ordenado: ");
		int aux = 0;
		for(int i = 0; i < idade.length; i++) {
			for(int j = 0; j < idade.length; j++) {
				if(idade[i] < idade[j]) {
					aux	= idade[i];
					idade[i] = idade[j];
					idade[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println("-> "+ idade[i]);

		}
	}
}