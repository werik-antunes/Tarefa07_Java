package tarefa07_java;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * 10) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
		 * (considere que as idades dos homens serão sempre diferentes entre si, bem
		 * como as das mulheres). Calcule e escreva a soma das idades do homem mais
		 * velho com a mulher mais nova, e o produto das idades do homem mais novo com a
		 * mulher mais velha.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade do primeiro homem: ");
		int idadeHomem1 = sc.nextInt();

		System.out.println("Digite a idade do segundo homem: ");
		int idadeHomem2 = sc.nextInt();

		System.out.println("Digite a idade da primeira mulher: ");
		int idadeMulher1 = sc.nextInt();

		System.out.println("Digite a idade da segunda mulher: ");
		int idadeMulher2 = sc.nextInt();

		int homemVelho = Math.max(idadeHomem1, idadeHomem2);
		int homemNovo = Math.min(idadeHomem1, idadeHomem2);

		int mulherVelha = Math.max(idadeMulher1, idadeMulher2);
		int mulherNova = Math.min(idadeMulher1, idadeMulher2);

		int soma = homemVelho + mulherNova;
		int produto = homemNovo * mulherVelha;

		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);

		sc.close();
	}

}
