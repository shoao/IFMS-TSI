import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int opcao, num1, num2;
        
        System.out.println("---- MENU ----");
        System.out.println("[1] - Ler dois números inteiros e apresentar a soma deles.");
        System.out.println("[2] - Ler um número inteiro e apresentar os três números subsequentes ao número lido");
        System.out.println("[3] - Ler um número inteiro e apresentar os três números Antecedentes ao número lido");
        System.out.println("[4] - Ler um número inteiro e informar se o número é múltiplo de 9");
        System.out.println("[5] - Ler o ano de nascimento de uma pessoa e o ano atual, depois informar a idade em dias da pessoa");
        System.out.print(": ");
        
        opcao = sc.nextInt();
        
        switch (opcao){
            
            case 1:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextInt();
                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextInt();
                
                System.out.println("Resultado: " + (num1 + num2) );
                break;
                
            case 2:
                System.out.print("Digite o numero: ");
                num1 = sc.nextInt();
                
                System.out.println("Resultado: ");
                System.out.println(num1 + 1);
                System.out.println(num1 + 2);
                System.out.println(num1 + 3);
                break;
                
            case 3:
                System.out.print("Digite o numero: ");
                num1 = sc.nextInt();
                
                System.out.println("Resultado: ");
                System.out.println(num1 - 1);
                System.out.println(num1 - 2);
                System.out.println(num1 - 3);
                break;
                
            case 4:
                System.out.println("Digite o numero: ");
                num1 = sc.nextInt();
                
                if (num1 % 9 == 0){
                    System.out.println("O numero é multiplo de 9.");
                    break;
                }
                else{
                    System.out.println("Não é multiplo de 9.");
                    break;
                }
            
            case 5:
                System.out.print("Digite o ano de nascimento: ");
                num1 = sc.nextInt();
                
                System.out.print("Digite o ano atual: ");
                num2 = sc.nextInt();
                
                System.out.println("Idade em dias: " + (num2 - num1) * 365 );
                
            default:
                System.out.println("Entrada Incorreta!");
        }
        
    }
}
