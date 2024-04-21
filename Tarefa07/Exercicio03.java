package tarefa07_java;

import java.util.Scanner;

public class Exercicio03 {
	public static int SomaMaior(int a, int b, int c) {
		int menor = Math.min(Math.min(a, b), c);
		int somaMaior = (a + b + c) - menor;
		return somaMaior ;
	}

	public static void main(String[] args) {
		/*
		 * 3) Ler 3 valores (considere que não serão informados valores iguais) e
		 * escrever a soma dos 2 maiores
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int num1 = sc.nextInt();

		System.out.println("Digite o segundo número");
		int num2 = sc.nextInt();

		System.out.println("Digite o terceiro número");
		int num3 = sc.nextInt();

		int somaMaior = SomaMaior(num1, num2, num3);
		
		System.out.println("A soma dos dois maiores número é: " + somaMaior);

		sc.close();
	}

}
