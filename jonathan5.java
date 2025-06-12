import java.util.Scanner;

public class jonathan5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digíte um caracter qualquer:");
        String caracter = sc.nextLine() ;

        String vogal = "a";

        if (caracter == vogal){
            System.out.print("É uma vogal");
        }

    }
}
