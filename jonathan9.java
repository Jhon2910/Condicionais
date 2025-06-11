import java.util.Scanner;

public class jonathan9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c,d,r1,r2 ;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c= sc.nextDouble();

        if (a == 0) {
            System.out.print("Não é uma equação de 2° grau");
            if (b==0){
                System.out.print("Não é uma equação de 2° grau");
            }
            else {
                r1 = -c/b;
                System.out.print("r1");
            }
        }
        sc.close();
    }
}
