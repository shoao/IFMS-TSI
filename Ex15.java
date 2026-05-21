import java.util.Scanner;

public class Ex15 {
    
    public static void main(String[] args){
        int aprovados = 0;
        int reprovados = 0;
        int recuperacao = 0;
        
        float somaMedias = 0;
        float maiorMedia = 0;
        float menorMedia = 10;
        
        float nota1, nota2, media;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            System.out.println("\nAluno " + (i+1));
            
            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextFloat();
            
            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextFloat();
            
            media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
            
            if (media >= 7){
                System.out.println("Aprovado");
                aprovados++;
            }
            
            if (media <= 5){
                System.out.println("Reprovado");
                reprovados++;
            }
            
            if (media > 5 && media < 7){
                System.out.println("Recuperação");
                recuperacao++;
            }
            
            somaMedias += media;
            
            if (media > maiorMedia){
                maiorMedia = media;
            }
            
            if (media < menorMedia){
                menorMedia = media;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Média geral: " + (somaMedias / 10));
        System.out.println("Maior média: " + maiorMedia);
        System.out.println("Menor média: " + menorMedia);
    }
}
