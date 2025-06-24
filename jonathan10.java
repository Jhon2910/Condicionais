import java.util.Scanner;

public class jonathan10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (em KG): ");

        if (sc.hasNextDouble()){
            double peso = sc.nextInt();

            System.out.print("Digite sua altura (em metros): ");
            double altura = sc.nextInt();

            double imc = peso/(Math.pow(altura,2)) ;

            if (peso < 0 && altura < 0){
                System.out.println("Digite um numero maior que 0!");
            }
            else {
                if (imc < 18.5){
                    System.out.printf("Seu imc é %.2f ,você está Abaixo do peso!",imc);
                }
                else if (imc <= 25){
                    System.out.printf("Seu imc é %.2f ,peso normal!",imc);
                }
                else if (imc < 30){
                    System.out.printf("Seu imc é %.2f ,Acima do peso!",imc);
                }
                else {
                    System.out.printf("Seu imc é %.2f ,Acima do peso!",imc);
                }
            }
        }
        else {
            System.out.println("Digite apenas numeros!");
        }
    }
}
