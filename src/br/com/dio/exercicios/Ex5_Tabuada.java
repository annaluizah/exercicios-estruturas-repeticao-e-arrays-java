package br.com.dio.exercicios;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada capaz de gerar a tabuada
* de qualquer número inteiro entre 1 e 10.
* O usuário deve informar de qual número ele deseja ver a tabuada.
* A saída deve ser conforme o sexemplo abaixo:
*
* Tabuada de 5:
* 5 X 1 = 5
* 5 X 2 = 10
* ...
* 5 X 10 = 50*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da tabuada que deseja ver (1 a 10): ");
        int numeroTabuada = scan.nextInt();

        System.out.println("Tabuada de " + numeroTabuada);

        for(int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada*i));
        }


    }
}
