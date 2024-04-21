package tarefa07_java;

import java.util.Scanner;

public class Exercicio02 {
	public static int Maior(int a, int b, int c) {
		int maior = a;
		if(b > maior) {
			maior = b;
		}
		if(c > maior) {
			maior = c;
		}
		return maior;
	}
	public static void main(String[] args) {
		/*
		 * 2) Ler 3 valores (considere que não serão informados valores iguais) e
		 * escrever o maior deles.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número");
		int num3 = sc.nextInt();
		
		int maior = Maior (num1, num2, num3);
		
		System.out.println("O maior valor digitado é: " + maior);
		sc.close();
	}

}
