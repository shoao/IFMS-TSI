// Implemente um algoritmo que solicite
// que o(a) usuário(a) informe dois números 
// inteiros e armazene os seus valores
// nas variáveis a e b, depois troque os 
// valores de a com b e exiba na saída 
// os seus valores.

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args){        
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
    }
    
}
