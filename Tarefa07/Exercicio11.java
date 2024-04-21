package tarefa07_java;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * 11) Uma fruteira está vendendo frutas com a seguinte tabela de preços: Se o
		 * cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar
		 * R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um
		 * algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de
		 * maças adquiridas e escreva o valor a ser pago pelo cliente.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade em Kg de morangos:");
		double quantidadeMorangos = sc.nextDouble();

		System.out.println("Informe a quantidade em Kg de maçãs:");
		double quantidadeMaca = sc.nextDouble();

		double precoMorango = calcularPrecoMorango(quantidadeMorangos);
		double precoMaca = calcularPrecoMaca(quantidadeMaca);

		double precoTotal = precoMorango + precoMaca;

		if (quantidadeMorangos + quantidadeMaca > 8 || precoTotal > 25) {
			precoTotal *= 0.9;
		}

		System.out.println("Valor a ser pago pelo cliente: R$" + precoTotal);

		sc.close();
	}

	public static double calcularPrecoMorango(double quantidade) {
		if (quantidade <= 5) {
			return quantidade * 2.5;
		} else {
			return quantidade * 2.2;
		}
	}

	public static double calcularPrecoMaca(double quantidade) {
		if (quantidade <= 5) {
			return quantidade * 1.8;
		} else {
			return quantidade * 1.5;
		}
	}

}
