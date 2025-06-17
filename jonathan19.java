import java.util.Scanner;

public class jonathan19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário base(R$): ");
        System.out.print("Digite o tempo de serviço(anos): ");
        
       if (sc.hasNextDouble()){
        Double SalarioBase = sc.nextDouble();
        Double tempo = sc.nextDouble();
        
            if (SalarioBase < 200){
                double imposto=0;
            } 
            else if (SalarioBase >= 200 && SalarioBase <= 450) {
                double imposto=0.03;
            }
            else if (SalarioBase > 450 && SalarioBase < 700) {
                double imposto = 0.08 ;
            }
            else {
                double imposto = 0.12 ;
            }
            
            if (SalarioBase > 500 && tempo <= 3){
                double gratificacao = 20 ;
            }
            else if (SalarioBase > 500 && tempo > 3){
                double gratificacao = 30 ;
            }
            else if (SalarioBase < 500 && tempo < 3 ){
                double gratificacao = 23;
            }
            else if (SalarioBase >3 && SalarioBase <6 ){
                double gratificacao = 35 ;
            }
            else if (SalarioBase > 500 ){
                
            }
            
       }
       else {
           System.out.println("Digite apenas números!");
       }
    }
}
