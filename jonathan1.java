import java.util.Scanner;

public class jonathan1 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a idade do atleta:");
        N = sc.nextInt();

        if (N < 5) {
            System.out.print("Idade invalida!");
        }
        else if (N >= 0 && N < 5) { //Não precisa de condicional.
            System.out.print("Não participa!");
        }
        else if (N >= 5 && N <=10){
            System.out.print("Infatil!");
        }
        else if (N > 10 && N < 18){
            System.out.print("Juvenil!");
        }
        else if (N >= 18 && N <40){
            System.out.print("Adulto!");
        }
        else {
            System.out.print("Sênior!");
        }

        sc.close();
    }
}
