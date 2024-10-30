package pratica_while;

import java.util.Scanner;

public class Atividade2_While {

	public static void main(String[] args) {

		int maior = 0, menor = 0, idade = 0;
		Scanner declarado = new Scanner(System.in);

		while (idade >= 0) {

			System.out.println("\nInforme a idade: ");
			idade = declarado.nextInt();

			if (idade >= 50) {
				maior++;
			} else if (idade <= 21 && idade >= 0) {
				menor++;
			}

		}
		System.out.println("Total de pessoas menores que 21 anos: " + menor);

		System.out.println("Total de pessoas maiores que 50 anos: " + maior);

		declarado.close();
	}
}