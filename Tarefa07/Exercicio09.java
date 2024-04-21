package tarefa07_java;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * 9) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de
		 * combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
		 * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
		 * gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de litros vendidos: ");
		double litrosVendidos = sc.nextDouble();

		System.out.print("Digite o tipo de combustível (A - álcool, G - gasolina): ");
		char tipoCombustivel = sc.next().charAt(0);

		double precoPorLitro = 0;
		double descontoPorLitro = 0;

		if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
			precoPorLitro = 2.90;
			if (litrosVendidos <= 20) {
				descontoPorLitro = 0.03;
			} else {
				descontoPorLitro = 0.05;
			}
		} else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
			precoPorLitro = 3.30;
			if (litrosVendidos <= 20) {
				descontoPorLitro = 0.04;
			} else {
				descontoPorLitro = 0.06;
			}
		} else {
			System.out.println("Tipo de combustível inválido. Por favor, digite A para álcool ou G para gasolina.");
			return;
		}

		double valorTotalSemDesconto = litrosVendidos * precoPorLitro;
		double descontoTotal = litrosVendidos * descontoPorLitro;
		double valorTotalComDesconto = valorTotalSemDesconto - descontoTotal;

		System.out.println("Valor a ser pago pelo cliente: R$" + valorTotalComDesconto);
		sc.close();
	}

}
