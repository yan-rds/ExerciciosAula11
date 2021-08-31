package br.com.zup;

    // Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes. A primeira vez com "for" e a segunda com "while".

public class Exercicio1 {

    public static void main(String[] args) {
            // Utilizando for
        for (int contador = 1; contador <= 100 ; contador ++) {
            System.out.println(contador);
        }
            // Utilizando while
        int contador = 1;

        while (contador <= 100) {
            System.out.println(contador);
            contador++;
        }


    }
}
