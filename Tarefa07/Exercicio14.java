package tarefa07_java;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * 14) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3
		 * verificações e a média dos exercícios que fazem parte da avaliação. Calcular
		 * a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do
		 * aluno de acordo com a tabela de conceitos mais abaixo:
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da primeira verificação:");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a nota da segunda verificação:");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a nota da terceira verificação:");
		double nota3 = sc.nextDouble();

		System.out.println("Digite a média dos exercícios:");
		double mediaExercicios = sc.nextDouble();

		double mediaAproveitamento = (nota1 + nota2 + nota3) / 3 * 0.7 + mediaExercicios * 0.3;

		char conceito;
		if (mediaAproveitamento >= 9.0) {
			conceito = 'A';
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
			conceito = 'B';
		} else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
			conceito = 'C';
		} else if (mediaAproveitamento >= 6.0) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}

		System.out.println("Média de aproveitamento: " + mediaAproveitamento);
		System.out.println("Conceito: " + conceito);

		sc.close();
	}

}
