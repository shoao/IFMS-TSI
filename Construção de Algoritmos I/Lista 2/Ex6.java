// Implemente um algoritmo que solicite que 
// o(a) usuário(a) dois números, calcule e 
// exiba na saída a soma e a média desses
// dois números.

import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args){
        int num1, num2, soma, media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite o valor do segundo numero: ");
        num2 = sc.nextInt();
        
        soma = num1 + num2;
        
        media = (num1 + num2) / 2;
        
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
    }
    
}
