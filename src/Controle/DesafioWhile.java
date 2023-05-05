package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nota = 0;
        int nValidas = 0;
        double somaDasNotas = 0;

        while (nota != -1){

                System.out.println("Digite uma nota");
                nota = s.nextDouble();
                if (nota >=0 && nota <=10) {

                    somaDasNotas += nota;
                    nValidas++;
                }
                else {
                    System.out.println("Digite uma nota valida");
                }
            }
        double media = somaDasNotas / nValidas;
        System.out.println("A média das nota é: " + media );

        s.close();
        }

    }

