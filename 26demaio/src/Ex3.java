import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){
        
        int numero = Integer.MAX_VALUE;
        
        Scanner sc = new Scanner(System.in);
        
        while (numero != 9999){
            System.out.print("Digite o numero: ");
            
            numero = sc.nextInt();
            
            System.out.println("Dobro do numero: " + (numero * 2));
        }
        
        System.out.println("Algoritmo encerrado.");
        
    }
    
}
