import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, op;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextInt();
        
        System.out.println("=====================");
        System.out.println("SELECIONE A OPERAÇÃO");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.println("5 - NUM1 // 7");
        System.out.println("6 - NUM2 IMPAR OU PAR");
        System.out.print(": ");
        op = sc.nextInt();
        
        switch (op){
            
            case 1:
                System.out.println("Resultado: " + (num1 + num2) );
                break;
                
            case 2:
                System.out.println("Resultado: " + (num1 - num2) );
                break;
                
            case 3:
                System.out.println("Resultado: " + (num1 * num2) );
                break;
                
            case 4:
                System.out.println("Resultado: " + (num1 / num2) );
                break;
                
            case 5:
                
                if (num1 % 7 == 0){
                    System.out.println(num1 + " É divisivel por 7.");
                    break;
                }
                else{
                    System.out.println("Não é divisel por 7");
                    break;
                }
                
            case 6:
                
                if (num2 % 2 == 0){
                    System.out.println(num2 + " é PAR");
                    break;
                }
                else{
                    System.out.println(num2 + " é IMPAR");
                    break;
                }
                
            default:
                System.out.println("Não existe esta opção.");
                break;
        }

    }
    
}
