import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float numeros = 0;
        int impares = 0;
        int pares = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            
            float numero = sc.nextFloat();
            
            numeros += numero;
            
            if (numero % 2 == 0){
                pares += 1;
            }
            else if ( numero % 2 != 0){
                impares += 1;
            }
        }
        
        System.out.println("Soma dos numeros digitados: " + numeros);
        System.out.println("Média dos numeros digitados: " + (numeros / 10) );
        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);
    }
    
}
