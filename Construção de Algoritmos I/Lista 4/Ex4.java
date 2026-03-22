import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double num;
        
        System.out.print("Digite o valor do numero: ");
        num = sc.nextDouble();
        
        if (num % 8 == 0){
            System.out.println(num + " é multiplo de 8.");
        }
        else{
            System.out.println(num + " não é multiplo de 8");
        }
    }
}
