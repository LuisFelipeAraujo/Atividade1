package atividade1;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome:");
		String nome = ler.nextLine();

		System.out.println("Digite a idade:");
		String idade = ler.nextLine();

		System.out.println("Seus nome é : " + nome);
		System.out.println("Sua idade é : " + idade);
	}

}
