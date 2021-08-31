package br.com.zup;

      // Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário. O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido (começando por um valor maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.

import java.util.Scanner;

public class LevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        int valorInicial;
        int valorFinal;
        int soma = 0;



        // Primeira parte do console
        System.out.println("Este programa irá somar todos os números ímpares que existem em um intervalo definido por você");
        System.out.println("Para começarmos, digite o valor inicial do intervalo");
        valorInicial = leitor.nextInt();
        System.out.println("Agora digite o valor final deste intervalo");
        valorFinal = leitor.nextInt();

        // Condicional para o programa só rodar se os valores inicias e finais estiverem certos
        if (valorInicial < valorFinal) {

            // Criando a estrutura de repetição
            while (valorInicial <= valorFinal) {
                if (valorInicial % 2 == 0) {
                    valorInicial = valorInicial + 1;
                }
                soma = soma + valorInicial;
                valorInicial = valorInicial + 2;

            }
            // Dando a resposta ao usuário
            System.out.println(soma);
        }

        else {
            System.out.println("Intervalo de valores inválido" );
        }
    }
}
