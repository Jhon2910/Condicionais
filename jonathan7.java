import java.util.Scanner;

public class jonathan7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de fabricação: ");

        if (sc.hasNextInt()){
            int ano = sc.nextInt();
            
            System.out.print("Digite o valor da tebela FIP do carro: ");

            if(sc.hasNextDouble()){
                double tabela =sc.nextDouble();
                
            if (ano >= 0 && ano < 1990) {
                System.out.printf("O imposto a ser pago é: R$%.2f\n",tabela * 0.01);
                
            } else if (ano >= 1990 && ano <= 2025) {
                System.out.printf("O imposto a ser pago é: R$%.2f\n",tabela * 0.015);
                
            } else {
                System.out.println("Ano invalido!, por favor digite um ano entre 0 e 2025!");
            }
        }
            else {
                System.out.println("O valor invalido!");
            }
        }
        else {
            System.out.println("Por favor, digite apenas numeros inteiros!\nEx: 2022");
        }
        sc.close();
    }
}
