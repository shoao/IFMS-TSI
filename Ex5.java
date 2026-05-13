import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        
        for (int i = numero; i < numero + 31; i++){
            System.out.println("Numero: " + i);
        }
        
    }
    
}
