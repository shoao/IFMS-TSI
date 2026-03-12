// Implemente um algoritmo que solicite que
// o(a) usuário(a) informe o comprimento 
// e a largura de um terreno, calcule
// e exiba na saída o valor da sua área.

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double comprimento, largura, area;
        
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        
        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        
        area = comprimento * largura;
        
        System.out.println("A área do terreno é igual a: " + area + "m");
    }
    
}
