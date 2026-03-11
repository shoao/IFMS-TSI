import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um valor: ");
        num = sc.nextInt();
        
        if(num != 1000){
            System.out.println("O numero é diferente de 1000.");
        }
        else{
            System.out.println("O numero é igual a 1000.");
        }
    }
    
}
