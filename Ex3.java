import java.util.Scanner;
import java.util.ArrayList;

public class Ex3 {
    
    public static void main(String[] args){
        
        String palavra;
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> Palavras = new ArrayList<String>();
        
        
        for (int i = 1; i < 10 + 1; i++){
            System.out.print("Digite uma palavra: ");
            palavra = sc.next();
            Palavras.add(palavra);
        }
        
        System.out.println("Lista completa: ");
        
        for (int i = 0; i < Palavras.size(); i++){
            System.out.println(Palavras.get(i));
        }
        
        
    }
    
}
