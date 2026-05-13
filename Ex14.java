import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        
        double S = 0;
        
        for (int i = 1; i < 199 + 1; i++){
            double valor = (double) i / (6 + i);

            S += valor;
        }
        
        System.out.println("Valor de S: " + S);
        
    }
    
}
