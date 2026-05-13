import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args){
        float Salario = 999999999;
        float salarioFor = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o salário: ");
            salarioFor = sc.nextFloat();
            
            if ( salarioFor < Salario ){
                Salario = salarioFor;
            }
            
        }
        
        System.out.println("Menor salário: " + Salario);
    }
    
}
