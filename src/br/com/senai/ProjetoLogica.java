package br.com.senai;

import java.util.Scanner;

public class ProjetoLogica {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;

		do {
			System.out.println("--- MENU ---");
			System.out.println("1 - Verificar sexo e idade");
			System.out.println("2 - Contagem de valores");
			System.out.println("3 - Tabuada");
			System.out.println("4 - Cadastrar cursos");
			System.out.println("5 - Sair do programa");
			System.out.print("Informe a op��o desejada: ");
			opcaoDoMenu = tec.nextInt();

			switch (opcaoDoMenu) {
			case 1:
				System.out.print("Informe o seu nome: ");
				String nome = tec.next();
				System.out.print("Informe o ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				int idade = 2021 - anoDeNascimento;
				System.out.print("Informe o seu sexo: [M/F] ");
				String sexo = tec.next();
				System.out.println(nome + " voc� nasceu em " + anoDeNascimento + " e tem " + idade + " anos.");

				if (idade >= 18) {
					System.out.println("Voc� � de maior.");
				} else if (idade < 18) {
					System.out.println("Voc� � de menor.");
				} else if (idade <= 12) {
					System.out.println("� crian�a.");
				} else if (idade > 12 && idade < 18) {
					System.out.println("� jovem.");
				} else if (idade >= 18 && idade < 65) {
					System.out.println("� adulto.");
				} else {
					System.out.println("� idoso.");
				}
				if (idade < 16) {
					System.out.println("N�o pode votar.");
				} else if (idade >= 16 && idade < 17) {
					System.out.println("Voto opcional.");
				} else if (idade >= 18 && idade < 70) {
					System.out.println("Seu voto � obrigat�rio.");
				} else if (idade > 70) {
					System.out.println("Seu voto � opcional.");
				}
				if (idade < 18) {
					System.out.println("N�o pode tirar habilita��o.");
				} else if (idade >= 18) {
					System.out.println("Pode tirar habilita��o.");
				}
				if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
					System.out.println("Op��o inv�lida.");
				} else if (sexo.equalsIgnoreCase("m")) {
					System.out.println("Voc� � do sexo masculino.");
				} else {
					System.out.println("Voc� � do sexo feminino.");
				}
				break;

			case 2:
				System.out.println("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.println("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();

				if (primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia.");
				} else if (primeiroValor > segundoValor) {
					while (segundoValor <= primeiroValor) {
						System.out.println(segundoValor);
						segundoValor++;
					}
				} else if (primeiroValor < segundoValor) {
					while (primeiroValor <= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor++;
					}
				}
				break;

			case 3:
				System.out.print("Digite o n�mero desejado: ");
				int valor = tec.nextInt();
				int multiplicador = 0;

				while (multiplicador <= 10) {
					System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				}
				break;

			case 4:
				String cursos[] = new String[5];
				String inserirCurso = "s";
				int auxiliar = 0;

				while (inserirCurso.equalsIgnoreCase("s") && auxiliar < cursos.length) {
					System.out.println("Informe o nome do curso: ");
					cursos[auxiliar] = tec.next();
					auxiliar++;
					System.out.print("Deseja cadastrar um novo curso? [S/N] ");
					inserirCurso = tec.next();
				}

				System.out.println("--- CURSOS CADASTRADOS ---");
				for (int i = 0; i < cursos.length; i++) {
					System.out.println(cursos[i]);
				}
				break;

			case 5:
				opcao = "n";
				break;

			default:
				System.out.println("Op��o inv�lida.");
				break;
			}

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("Sistema finalizado.");

	}

}