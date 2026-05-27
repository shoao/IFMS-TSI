import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numero = Integer.MAX_VALUE;
        int i = 0;
        
        while (numero > 0){
            System.out.println("Digite o numero: ");
            numero = sc.nextInt();
            i += 1;
        }
        
        System.out.print("Numeros digitados: " + i + "\n");
    }
    
}
