package pratica_dowhile;

import java.util.Scanner;

public class Atividade3_DoWhile {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.println("\nDigite um número: ");
            numero = valor.nextInt();
            
            if (numero > 0) {
                soma += numero;
            }
            
        } while (numero != 0);

        System.out.println("A soma de todos os números positivos é: " + soma);

        valor.close();
    }
}