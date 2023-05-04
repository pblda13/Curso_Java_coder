package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en","US"));

        Scanner s = new Scanner(System.in);

        String salario1 = s.nextLine().replace(",", ".");
        String salario2 = s.nextLine().replace(",", ".");
        String salario3 = s.nextLine().replace(",", ".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);

        double media = (s1+s2+s3)/3;

        System.out.printf("A média é "+ media);

        s.close();


    }
}
