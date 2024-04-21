package tarefa07_java;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6) Ler o nome de 2 times e o número de gols marcados na partida (para cada
		 * time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser
		 * impressa a palavra EMPATE.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro time:");
        String time1 = sc.nextLine();
        
        System.out.println("Digite o número de gols marcados pelo primeiro time:");
        int golsTime1 = sc.nextInt();

        System.out.println("Digite o nome do segundo time:");
        String time2 = sc.nextLine();
        time2 = sc.nextLine();
        
        System.out.println("Digite o número de gols marcados pelo segundo time:");
        int golsTime2 = sc.nextInt();

        String vencedor;
        if (golsTime1 > golsTime2) {
            vencedor = time1;
        } else if (golsTime2 > golsTime1) {
            vencedor = time2;
        } else {
            vencedor = "EMPATE";
        }

        System.out.println("O vencedor é: " + vencedor);
		sc.close();
	}

}
