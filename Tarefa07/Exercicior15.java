package tarefa07_java;

import java.util.Scanner;

public class Exercicior15 {

	public static void main(String[] args) {
		/*
		 * 15) Uma empresa quer verificar se um empregado está qualificado para a
		 * aposentadoria ou não. Para estar em condições, um dos seguintes requisitos
		 * deve ser satisfeito:
		 * 
		 * - Ter no mínimo 65 anos de idade.
		 * 
		 * - Ter trabalhado no mínimo 30 anos.
		 * 
		 * - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
		 * 
		 * Com base nas informações acima, faça um algoritmo que leia: o número do
		 * empregado (código), o ano de seu nascimento e o ano de seu ingresso na
		 * empresa. O programa deverá escrever a idade e o tempo de trabalho do
		 * empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do empregado código:");
		int codigoEmpregado = sc.nextInt();

		System.out.println("Digite o ano de nascimento do empregado:");
		int anoNascimento = sc.nextInt();

		System.out.println("Digite o ano de ingresso na empresa do empregado:");
		int anoIngressoEmpresa = sc.nextInt();

		int idade = 2024 - anoNascimento;

		int tempoTrabalho = 2024 - anoIngressoEmpresa;

		boolean requerAposentadoria = false;

		if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
			requerAposentadoria = true;
		}

		System.out.println("Idade do empregado: " + idade + " anos");
		System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

		if (requerAposentadoria) {
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println("Não requerer");
		}

		sc.close();
	}

}
