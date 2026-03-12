// Implemente um algoritmo que solicite que o(a) 
// usuário(a) informe o ano de nascimento de uma
// pessoa e exiba na saída quantos anos essa pessoa
// tem ou terá no ano atual.

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
      
        int ano_nascimento, idade;
        
        System.out.print("Entre com o ano de nascimento: ");
        ano_nascimento = sc.nextInt();
        
        idade = 2026 - ano_nascimento;
        
        System.out.println("Idade é: " + idade + " anos.");
        
        
    }
}
