import java.util.Scanner;

public class jonathan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, r1, r2;

        System.out.print("Digite o coeficiente a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        else {
            System.out.println("Entrada inválida. Digite um número.");
            sc.close();
            return;
        }

        System.out.print("Digite o coeficiente b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        else {
            System.out.println("Entrada inválida. Digite um número.");
            sc.close();
            return;
        }
        System.out.print("Digite o coeficiente c: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }
        else {
            System.out.println("Entrada inválida. Digite um número.");
            sc.close();
            return;
        }
        if (a == 0) {
            if (b == 0) {
                System.out.println("Não é uma equação válida.");
            }
            else {
                r1 = -c / b;
                System.out.printf("Equação de 1º grau. Raiz: %.2f%n", r1);
            }
        }
        else {
            delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            }
            else if (delta == 0) {
                r1 = -b / (2 * a);
                System.out.printf("A equação possui uma raiz real: %.2f%n", r1);
            }
            else {
                r1 = (-b + Math.sqrt(delta)) / (2 * a);
                r2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("A equação possui duas raízes reais: r1 = %.2f, r2 = %.2f%n", r1, r2);
            }
        }

        sc.close();
    }
}
