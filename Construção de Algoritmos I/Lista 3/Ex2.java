import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double salario, novo_salario;
        
        System.out.println("Digite o valor do salário do funcionario: ");
        salario = sc.nextFloat();
        
        // Processamento
        // O novo salário é o salário com um aumento de 15%
        
        novo_salario = salario * 1.15;
        
        System.out.println("O novo salário é: " + novo_salario);
    }
    
}
