import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double valor_bruto, valor_novo;
        
        System.out.println("Digite o valor bruto do produto: ");
        valor_bruto = sc.nextFloat();
        
        // Processamento
        
        valor_novo = valor_bruto * 0.91; // 9% de desconto
        
        System.out.println("O valor do produto com 9% de desconto é: " + valor_novo);
    }
    
}
