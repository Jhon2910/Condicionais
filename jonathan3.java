import java.util.Scanner;

public class jonathan3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()){
            System.out.print("Digíte  o custo de fabrica: ");
            double custo = sc.nextDouble() ;
    
            if (custo >= 0 && custo <= 28000){
                System.out.print(custo + 0.5 + 0.0);
            }
            else if(custo > 28000 && custo <= 45000){
                System.out.print(custo + 0.10 + 0.15);
            }
            else if(custo > 45000){
                System.out.print(custo + 0.15 + 0.20);
            }
            else {
                System.out.print("Valor inválido!");
            }
        }
        else {
            System.out.print("Digíte apenas números!");
        }
    }
}
