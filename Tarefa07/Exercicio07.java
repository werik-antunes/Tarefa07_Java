package tarefa07_java;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7) Ler dois valores e imprimir uma das três mensagens a seguir:
		 * ‘Números iguais’, caso os números sejam iguais
		 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
		 * ‘Segundo maior’, caso o segundo seja maior que o primeiro.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("O valor maior é: " + num1);
		} else if(num2 > num1) {
			System.out.println("O valor maior é: " + num2);
		}else if(num1 == num2) {
			System.out.println("Os valores são iguais");
		}
		sc.close();
	}

}
