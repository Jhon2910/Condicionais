import java.util.Scanner;

public class jonathan7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de fabricação: ");

        if (sc.hasNextInt()) {
            int ano = sc.nextInt();

            if (ano >= 0 && ano < 1990) {
                System.out.printf("O imposto a ser pago é: %.2f\n",ano * 1.1);
            } else if (ano >= 1990 && ano <= 2025) {
                System.out.printf("O imposto a ser pago é: %.2f\n",ano * 1.5);
            } else {
                System.out.println("Ano invalido!, por favor digite um ano entre 0 e 2025!");
            }
        }
        else {
            System.out.println("Por favor, digite apenas numeros com 1 casa decimal!");
        }
        sc.close();
    }
}
