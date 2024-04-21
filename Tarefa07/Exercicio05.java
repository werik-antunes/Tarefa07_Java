package tarefa07_java;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * 5) Ler 3 valores (A, B e C) representando as medidas dos lados de um
		 * triângulo e escrever se formam ou não um triângulo. OBS: para formar um
		 * triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado A do triângulo:");
		int ladoA = sc.nextInt();
		
		System.out.println("Digite o valor do lado B do triângulo:");
		int ladoB = sc.nextInt();
		
		System.out.println("Digite o valor do lado C do triângulo:");
		int ladoC = sc.nextInt();
		
		if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			System.out.println("Os números formam um triangulo");
		}else {
			 System.out.println("Os números digitados não formam um triângulo.");
		}
		sc.close();
	}

}
