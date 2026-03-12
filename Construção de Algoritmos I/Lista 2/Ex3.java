// Implemente um algoritmo que solicite que
// o(a) usuário(a) informe dois números 
// inteiros e exiba na saída o valor do
// produto entre eles.

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, produto;
        
        System.out.print("Digite o valor do primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Digite o valor do segundo numero: ");
        num2 = sc.nextInt();
        
        produto = num1 * num2;
        
        System.out.println("O valor do produto entre os numeros é: " + produto);
    }
}
