import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int negativos = 0;
        int positivos = 0;
        
        for (int i = 0; i < 20; i++){
            
            System.out.print("Digite o numero: ");
            
            int numero = sc.nextInt();
            
            if (numero >= 0){
                positivos += numero;
            }
            else{
                negativos += 1;
            }
        }
        
        
        System.out.println("Soma dos numeros positivos: " + positivos);
        System.out.println("Quantidade de numeros negativos: " + negativos);

    }
    
    
}
