import java.util.Scanner;
import java.util.ArrayList;


public class Ex2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> dias = new ArrayList<String>();
        
        int opcao;
        
        dias.add("Domingo");
        dias.add("Segunda Feira");
        dias.add("Terça Feira");
        dias.add("Quarta Feira");
        dias.add("Quinta Feira");
        dias.add("Sexta Feira");
        dias.add("Sabado");
        
        
        System.out.print("Digite o numero do dia (0 a 6): ");
        opcao = sc.nextInt();
        
        switch (opcao){
            
            case 0:
                System.out.println(dias.get(0));
                break;
                
            case 1:
                System.out.println(dias.get(1));
                break;
                
                
            case 2:
                System.out.println(dias.get(2));
                break;
                
            case 3:
                System.out.println(dias.get(3));
                break;
                
            case 4:
                System.out.println(dias.get(4));
                break;
                
            case 5:
                System.out.println(dias.get(5));
                break;
                
            case 6:
                System.out.println(dias.get(6));
                break;
                
            default:
                System.out.println("não existe dia com este número.");
                break;
        }
        
    }
    
}
