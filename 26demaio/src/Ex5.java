import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double soma = 0.0;
        double media = 0.0;
        double numero = 0.0;
        
        int contador = 0;
        
        while (true) {
            
            System.out.print("Digite o numero: ");
            
            numero = sc.nextInt();
            
            if (numero == 9999) {
                break;
            }
            
            contador += 1;
            
            soma += numero;
        }
        
        media = soma / contador;
        
        System.out.print("Soma: " + soma + "\n");
        System.out.print("Media: " + media + "\n");
    }
    
}
