import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a;
        
        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        
        if(a > 0){
            System.out.println("A é um numero positivo");
        }
        
        if(a < 0){
            System.out.println("A é um numero negativo");
        }
        
        if(a == 0){
            System.out.println("A é igual a 0");
        }
        
    }
    
}
