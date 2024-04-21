package tarefa07_java;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * 12) Faça um algoritmo para ler um número que é um código de usuário. Caso
		 * este código seja diferente de um código armazenado internamente no algoritmo
		 * (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o
		 * Código seja correto, deve ser lido outro valor que é a senha. Se esta senha
		 * estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha
		 * incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso
		 * permitido’.
		 */
		Scanner sc = new Scanner(System.in);

		final int CODIGO_CORRETO = 1234;
		final int SENHA_CORRETA = 9999;

		System.out.println("Digite o código de usuário:");
		int codigoUsuario = sc.nextInt();

		if (codigoUsuario != CODIGO_CORRETO) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.println("Digite a senha:");
			int senha = sc.nextInt();

			if (senha != SENHA_CORRETA) {
				System.out.println("Senha incorreta!");
			} else {
				System.out.println("Acesso permitido!");
			}
		}

		sc.close();
	}

}
