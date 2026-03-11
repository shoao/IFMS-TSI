import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, media, soma;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        // Processamento
        
        soma = nota1 + nota2 + nota3;
        
        media = (double)soma / 3.0;
        
        if(media >= 6){
            System.out.println("O aluno foi aprovado");
        }
        else{
            System.out.println("O aluno foi REPROVADO");
        }
    }
    
}
