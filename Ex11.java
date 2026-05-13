import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args){
        int n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        n = sc.nextInt();
        
        for (int i = 0; i < 11; i++){
            System.out.println(i + " X " + n + " = " + (i * n) );
        }
    }
    
}
