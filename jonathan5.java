import java.util.Scanner;

public class jonathan5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digíte um caracter qualquer:");
        String caracter = sc.nextLine() ;

        char letra = caracter.charAt(0) ;

        if ((caracter.equals("a")) || (caracter.equals("e")) || (caracter.equals("i")) || (caracter.equals("o")) || (caracter.equals("u"))){
            System.out.println("Vogal");
        }
        else {
            System.out.print("É uma consoante");
        }
    }
}
