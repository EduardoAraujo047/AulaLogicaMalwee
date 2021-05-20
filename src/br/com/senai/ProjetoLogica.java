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
			System.out.print("Informe a opção desejada: ");
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
				System.out.println(nome + " você nasceu em " + anoDeNascimento + " e tem " + idade + " anos.");

				if (idade >= 18) {
					System.out.println("Você é de maior.");
				} else if (idade < 18) {
					System.out.println("Você é de menor.");
				} else if (idade <= 12) {
					System.out.println("É criança.");
				} else if (idade > 12 && idade < 18) {
					System.out.println("É jovem.");
				} else if (idade >= 18 && idade < 65) {
					System.out.println("É adulto.");
				} else {
					System.out.println("É idoso.");
				}
				if (idade < 16) {
					System.out.println("Não pode votar.");
				} else if (idade >= 16 && idade < 17) {
					System.out.println("Voto opcional.");
				} else if (idade >= 18 && idade < 70) {
					System.out.println("Seu voto é obrigatório.");
				} else if (idade > 70) {
					System.out.println("Seu voto é opcional.");
				}
				if (idade < 18) {
					System.out.println("Não pode tirar habilitação.");
				} else if (idade >= 18) {
					System.out.println("Pode tirar habilitação.");
				}
				if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
					System.out.println("Opção inválida.");
				} else if (sexo.equalsIgnoreCase("m")) {
					System.out.println("Você é do sexo masculino.");
				} else {
					System.out.println("Você é do sexo feminino.");
				}
				break;

			case 2:
				System.out.println("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.println("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();

				if (primeiroValor == segundoValor) {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência.");
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
				System.out.print("Digite o número desejado: ");
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
				System.out.println("Opção inválida.");
				break;
			}

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("Sistema finalizado.");

	}

}