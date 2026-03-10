import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media, soma;
        
        System.out.println("Digite o valor da primeira nota: ");
        nota1 = sc.nextFloat();
        
        System.out.println("Digite o valor da segunda nota: ");
        nota2 = sc.nextFloat();
        
        System.out.println("Digite o valor da terceira nota: ");
        nota3 = sc.nextFloat();
        
        // Processamento
        
        soma = nota1 + nota2 + nota3;
        
        media = (double)soma / 3.00;
        
        // Saida
        
        System.out.println("A média do aluno é: " + media);
    }
    
}
