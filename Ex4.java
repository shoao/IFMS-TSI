import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {
    
    public static void main(String[] args){
        
        String nome;
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> Nomes = new ArrayList<String>();
        
        
        for (int i = 1; i < 10 + 1; i++){
            System.out.print("Digite um nome: ");
            nome = sc.next();
            Nomes.add(nome);
        }
        
        System.out.println("Lista completa: ");
        
        for (int i = 0; i < Nomes.size(); i++){
            System.out.println(Nomes.get(i));
        }
        
        
    }
    
}
