package tarefa07_java;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4) Ler 3 valores (considere que não serão informados valores iguais) e
		 * escrevê-los em ordem crescente.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int b = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int c = sc.nextInt();
		
		int []num = {a, b, c};
		
		Arrays.sort(num);
		System.out.println("Números em ordem crescente:");
		for(int nume:num) {
			System.out.println(nume);
		}
		
		sc.close();
	}

}
