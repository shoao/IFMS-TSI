// Implemente um algoritmo que solicite que o
// (a) usuário(a) informe dois números inteiros
// e exiba na saída o valor da diferença 
// do primeiro pelo segundo.
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, res;
        
        System.out.print("Digite o valor do primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Digite o valor do segundo numero: ");
        num2 = sc.nextInt();
        
        res = num1 - num2;
        
        System.out.println("O valor de num1 - num2 é: " + res);
        
    }
}
