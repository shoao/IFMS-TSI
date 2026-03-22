import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double num;
        
        System.out.print("Digite o valor do numero: ");
        num = sc.nextDouble();
        
        if (num % 2 == 0){
            System.out.println(num + " é Par.");
        }
        else{
            System.out.println(num + " é Impar");
        }
    }
}
