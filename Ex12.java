import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args){
        float maiorAltura = 0;
        String maiorNome = "";
        
        float menorAltura = 99999;
        String menorNome = "";
        
        String nomeFor;
        float alturaFor;
        
        float Alturas = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite sua altura: ");
            alturaFor = sc.nextFloat();
            
            System.out.print("Digite seu nome: ");
            nomeFor = sc.next();
            
            if ( alturaFor > maiorAltura ){
                maiorAltura = alturaFor;
                maiorNome = nomeFor;
                Alturas += alturaFor;
            }
            
            if ( alturaFor < menorAltura ){
                menorAltura = alturaFor;
                menorNome = nomeFor;
                Alturas += alturaFor;

            }
        }
        
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Nome maior altura: " + maiorNome);
        
        System.out.println("-");
        
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Nome menor altura: " + menorNome);
        
        System.out.println("-");
        
        System.out.println("Soma das alturas: " + Alturas);
        System.out.println("Altura média: " + (Alturas / 10));
        
        
    }
    
}
    
