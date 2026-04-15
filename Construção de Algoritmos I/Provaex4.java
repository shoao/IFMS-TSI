import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        int opcao, num1, num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("[1] - Ler um número inteiro e apresentar os três números impares Subsequentes.");
        System.out.println("[2] - Ler um número inteiro e apresentar os três números pares Antecedentes.");
        System.out.println("[3] - Ler dois números inteiros e fazer a multiplicação do dobro do primeiro com a metade do segundo.");
        System.out.println("[4] - Ler a idade de uma pessoa e informar: Se a idade é par, informar a idade em dias; Se a idade for impar informar o ano de nascimento da pessoa");
        System.out.print(": ");
        
        opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                System.out.print("Digite o valor do numero: ");
                num1 = sc.nextInt();
                
                if (num1 % 2 == 0){
                    num1 = num1 - 1;
                }
                
                System.out.print(num1 + 2 + " ");
                System.out.print(num1 + 4 + " ");
                System.out.print(num1 + 6 + " ");
                break;
                
            case 2:
                System.out.print("Digite o valor do numero: ");
                num1 = sc.nextInt();
                
                if (num1 % 2 != 0){
                    num1 = num1 + 1;
                }
                
                System.out.print(num1 - 2 + " ");
                System.out.print(num1 - 4 + " ");
                System.out.print(num1 - 6 + " ");                
                
                break;
                
            case 3:
                System.out.print("Digite o valor do primeiro número: ");
                num1 = sc.nextInt();
                
                System.out.print("Digite o valor do segundo número: ");
                num2 = sc.nextInt();
                
                System.out.print("Resultado: " + (num1 * 2) * (num2 / 2) );
                break;
                
            case 4:
                System.out.print("Digite sua idade: ");
                num1 = sc.nextInt();
                
                if (num1 % 2 == 0){
                    System.out.println("A idade é par!");
                    System.out.println("Idade em dias: " + (num1 * 365) );
                }
                else{
                    System.out.println("Idade é impar!");
                    System.out.println("Ano de nascimento: " + (2026 - num1) );
                }
                
                break;
                
            default:
                System.out.println("valor invalido");
                break;
        }
        
    }
}
