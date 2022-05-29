package br.com.dio.exercicios;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja válido e continue pedindo
* até que o usuário informe um valor válido*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota válida, fim do programa...");
    }
}
