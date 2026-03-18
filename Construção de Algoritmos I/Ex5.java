import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, soma;
        
        System.out.print("Digite o valor do primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Digite o valor do segundo numero: ");
        num2 = sc.nextInt();
        
        soma = num1 + num2;
        
        if (soma > 20){
            System.out.println("A soma de " + num1 + " E " + num2 + " é maior que 20 e igual a " + soma);
        }
        else if ( soma < 20){
            System.out.println("A soma de " + num1 + " E " + num2 + " é menor que 20 e igual a " + soma);
        }
        else{
            System.out.println("A soma de " + num1 + " E " + num2 + " é igual a 20");

        }
    }
}
