import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite o valor do numero: ");
        num = sc.nextInt();
        
        if(num > 10){
            System.out.println("O numero informado é maior que 10: " + num);
        }
        
        if(num < 10){
            System.out.println("O numero informado é menor que 10: " + num);
        }
        
        if(num == 10){
            System.out.println("O numero informado é igual a 10.");
        }
        
    }
    
}
