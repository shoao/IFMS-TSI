import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int resposta;
        
        System.out.println("Quem matou Odete Roitman?\n");
        System.out.println("Código: Suspeito:");
        System.out.println("1       Marco Aurélio");
        System.out.println("2       César Ribeiro");
        System.out.println("3       Maria de Fátima Acioly");
        System.out.println("4       Celina Junqueira");
        System.out.println("5       Helena Roitman");
        System.out.print(": ");
        
        resposta = sc.nextInt();
        
        switch (resposta) {
            case 1:
                System.out.println("O suspeito escolhido foi: Marco Aurélio");
                break;
                
            case 2:
                System.out.println("O suspeito escolhido foi: César Ribeiro");
                break;

            case 3:
                System.out.println("O suspeito escolhido foi: Maria de Fátima Acioly");
                break;
                
            case 4:
                System.out.println("O suspeito escolhido foi: Celina Junqueira");
                break;
                
            case 5:
                System.out.println("O suspeito escolhido foi: Helena Roitman");
                break;
                
            default:
                System.out.println("Valor invalido.");
                break;
        }
        
        

    }
}
