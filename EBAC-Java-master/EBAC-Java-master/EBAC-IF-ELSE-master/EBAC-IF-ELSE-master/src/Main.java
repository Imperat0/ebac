import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double np1, np2, np3, np4;
        double media;

        System.out.println("Informe a nota np1 ");
        np1 = scnr.nextDouble();

        System.out.println("Informe a nota np2 ");
        np2 = scnr.nextDouble();

        System.out.println("Informe a nota np3 ");
        np3 = scnr.nextDouble();

        System.out.println("Informe a nota np4 ");
        np4 = scnr.nextDouble();

        media = (np1 + np2 + np3 + np4) / 4;
        System.out.println("A media do aluno é " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação");
        } else if (media <= 5) {
                System.out.println("Reprovado");
            }
    }

}