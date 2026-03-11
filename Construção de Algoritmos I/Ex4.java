import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        
        System.out.print("Digite o valor de A: ");
        a = sc.nextFloat();
        
        System.out.print("Digite o valor de B: ");
        b = sc.nextFloat();
        
        System.out.print("Digite o valor de C: ");
        c = sc.nextFloat();
        
        // 
        
        System.out.println("Valor de A + B: " + (a + b));
        System.out.println("Valor de A + C: " + (a + c));
        System.out.println("Valor de B + C: " + (b + c));
    }
    
    
}
