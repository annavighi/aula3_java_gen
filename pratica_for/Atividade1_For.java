package pratica_for;

import java.util.Scanner;

public class Atividade1_For {

    public static void main(String[] args) {
        int multiplo, valor1, valor2;
        Scanner numero = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        valor1 = numero.nextInt();

        System.out.println("\nDigite o segundo número: ");
        valor2 = numero.nextInt();

        if (valor2 < valor1) {
            System.out.println("O intervalo inserido é inválido!");
        } else {
            System.out.println("\nOs números entre " + valor1 + " e " + valor2 + " múltiplos de 3 e 5 são:");
            
            for (multiplo = valor1; multiplo <= valor2; multiplo++) {
                if (multiplo % 3 == 0 && multiplo % 5 == 0) {
                    System.out.println(multiplo);
                }
            }
        }

        numero.close();
    }
}
