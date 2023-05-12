package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um dia da semana");
        String dia =s.nextLine();

        if("Domingo".equalsIgnoreCase(dia)){
            System.out.println("1");
        } else if ("SEGUNDA".equalsIgnoreCase(dia)) {
            System.out.println("2");
        }else if ("TERÇA".equalsIgnoreCase(dia)) {
            System.out.println("3");
        }else if ("QUARTA".equalsIgnoreCase(dia)) {
            System.out.println("4");
        }else if ("QUINTA".equalsIgnoreCase(dia)) {
            System.out.println("5");
        }else if ("SEXTA".equalsIgnoreCase(dia)) {
            System.out.println("6");
        }else {
            System.out.println("7");
        }

        s.close();
    }
}
