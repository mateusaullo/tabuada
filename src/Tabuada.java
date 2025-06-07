import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Coloque um numero da tabuada");
        int numero1 = teclado.nextInt();


        for (int j = 1; j <= numero1; j++) {
            System.out.println("\n");

            for (int i = 1; i <= 10; i++) {
                int total = i*j;
                System.out.println(j + " x " + i + " = " +total);
            }
        }

    }
}