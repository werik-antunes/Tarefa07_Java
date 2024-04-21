package tarefa07_java;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * 8) Seja o seguinte algoritmo: início ler x ler y z <- (x*y) + 5 se z <= 0
		 * então resposta <- ‘A’ senão se z <= 100 então resposta <- ‘B’ senão resposta
		 * <- ‘C’ fim_se fim_se escrever z, resposta fim Faça um teste de mesa e
		 * complete o quadro a seguir para os seguintes valores:
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de X: ");
		int X = sc.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		int Y = sc.nextInt();
		
		int z = (X * Y) + 5;
		char resposta;
		
		if(z <= 0) {
			resposta = 'A';
		}else if(z <= 100) {
			resposta = 'B';
		}else {
			resposta = 'C';
		}
		 System.out.println("z: " + z + ", resposta: " + resposta);
		sc.close();
	}

}
