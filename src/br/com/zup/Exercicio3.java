package br.com.zup;

        // Escreva um programa que leia 10 números e escreva o menor valor lido é o maior valor lido.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        // Criando variáveis
        double numerosInseridos = 0;
        int totalDeNumeros = 10;
        double maiorNumero;
        double menorNumero;
        int contador = 2;

        // Primeira parte do console
        System.out.println("Irei ler 10 números que você inserir e te dizer o menor e o maior entre eles");
        System.out.println("Insira o 1º número");
        numerosInseridos = leitor.nextDouble();
        maiorNumero = numerosInseridos;
        menorNumero = numerosInseridos;

        // Criando a estrutura de repetição
        while (contador < 11) {
            System.out.println("Insira o " + contador + "º número");
            numerosInseridos = leitor.nextDouble();
            if (numerosInseridos > maiorNumero){
                maiorNumero = numerosInseridos;
            }
            if (numerosInseridos < menorNumero){
                menorNumero = numerosInseridos;
            }
            contador++;
        }
        System.out.println("O maior número é o " +maiorNumero);
        System.out.println("O menor número é o " +menorNumero);
    }
}
