package br.com.zup;

        //Faça um programa que leia números inteiros e imprima sua média.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        int totalDeNumeros;
        int contador = 1;
        int numeroRecebido;
        int soma = 0;


        // Primeira parte do console
        System.out.println("Te daremos a média dos números inteiros que você inserir");
        System.out.println("Por favor digite a quantidade totais de números que você quer calcular");
        totalDeNumeros = leitor.nextInt();

        // Criando a estrutura de repetição
        while (contador <= totalDeNumeros) {
            System.out.println("Insira o " + contador + "º número");
            numeroRecebido = leitor.nextInt();
            soma = soma + numeroRecebido;
            contador++;
        }

        double media = soma / totalDeNumeros;


        // Dando o resultado ao usuário
        System.out.println("A média desses números é:" +media);
    }
}
