import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args){
        
        int idade = 0;
        int idadeFor = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            System.out.println("Digite sua idade: ");
            idadeFor = sc.nextInt();
            
            if (idadeFor > idade){
                idade = idadeFor;
            }
        }
        
        System.out.println("Maior idade: " + idade);
        
    }
    
    
}
