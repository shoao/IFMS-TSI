import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double media;
        
        System.out.print("Digite a média do aluno: ");
        media = sc.nextFloat();
        
        if(media >= 6){
            System.out.println("O aluno foi aprovado");
        }
        else{
            System.out.println("O aluno foi REPROVADO");
        }
        
    }
    
}
