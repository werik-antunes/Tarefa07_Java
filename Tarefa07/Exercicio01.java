package tarefa07_java;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 1) Ler um valor e escrever se é positivo, negativo ou zero.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("O número digitado é positivo!");
		}else if(num < 0){
			System.out.println("O número digitado é negativo!");
		}else {
			System.out.println("O número digitado é zero!");
		}
		sc.close();

	}

}
