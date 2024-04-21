package tarefa07_java;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * 13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade
		 * adquirida e o preço unitário. Calcular e escrever o total (total = quantidade
		 * adquirida * preço unitário), o desconto e o total a pagar (total a pagar =
		 * total - desconto), sabendo-se que: Se quantidade <= 5 o desconto será de 2%
		 * Se quantidade > 5 e quantidade <=10 o desconto será de 3% Se quantidade > 10
		 * o desconto será de 5%
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a descrição do produto:");
		String produto = sc.nextLine();

		System.out.println("Digite a quantidade adquirida:");
		int quantidade = sc.nextInt();

		System.out.println("Digite o preço unitário:");
		double precoUnitario = sc.nextDouble();

		double total = quantidade * precoUnitario;
		double desconto = calcularDesconto(quantidade, total);
		double totalPagar = total - desconto;

		System.out.println("Total: R$" + total);
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Total a pagar: R$" + totalPagar);

		sc.close();
	}

	public static double calcularDesconto(int quantidade, double total) {
		double desconto;

		if (quantidade <= 5) {
			desconto = total * 0.02;
		} else if (quantidade <= 10) {
			desconto = total * 0.03;
		} else {
			desconto = total * 0.05;
		}

		return desconto;
	}
}
