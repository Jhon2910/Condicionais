import java.util.Scanner;

public class jonathan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digíte uma caracter qualquer:");
            String caracter = sc.nextLine();

            if (caracter.length() != 1){
                System.out.println("Digite apenas um caracter!");
            }
            else {
                if ((caracter.equals("a")) || (caracter.equals("e")) || (caracter.equals("i")) || (caracter.equals("o")) || (caracter.equals("u"))) {
                    System.out.println("É uma Vogal!");
                } else {
                    System.out.print("Não é uma Vogal!");
                }
            }
    }
}
