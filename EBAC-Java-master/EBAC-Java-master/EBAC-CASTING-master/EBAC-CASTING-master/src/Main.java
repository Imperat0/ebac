import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor numérico: ");


        int inputValue = scanner.nextInt();

        Boolean b = true;
        boolean b1 = Boolean.TRUE;

        Long lt = 20L;
        long lt1 = lt;

        Double dt = 99999.0;
        double dt1 = dt;
        System.out.println(dt);

        Integer it1 = 9999;
        int it = 9999;


        byte b2 = 60;
        long l3 = b2;
        System.out.println(l3);


        long l1 = 60000;
        double d1 = l1;
        System.out.println(l1);


        long l2 = 1111111111111111111l;
        byte b5 = (byte) l2;
        System.out.println(l2);

        scanner.close();
    }
}