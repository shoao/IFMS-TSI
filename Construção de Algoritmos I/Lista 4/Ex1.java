import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, peso1, peso2, valor_notas, valor_pesos;
        
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite o valor do peso: ");
        peso1 = sc.nextDouble();
        
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.print("Digite o valor do peso: ");
        peso2 = sc.nextDouble();
        
        valor_pesos = peso1 + peso2;
        valor_notas = (nota1 * peso1) + (nota2 * peso2);
        
        System.out.println("Media ponderada: " + valor_notas / valor_pesos);
        
    }
}
