package Fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        double f = 70;
        final int ajuste = 32;
        double multiplicador = 5.0/9.0 ;

        double c = (f- ajuste)*multiplicador;
        System.out.println("C = " + c);
    }
}
