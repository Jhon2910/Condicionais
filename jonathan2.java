import java.util.Scanner;

public class jonathan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int resto = n % 2;


        if (n / 2 != n % 2) {
            System.out.print("O número que voce digitou é impar!");
        } else {
            System.out.print("O númeero que voce digitou é par!");
        }

        sc.close();
    }
}
