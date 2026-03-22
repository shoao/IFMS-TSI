import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        if (idade >= 0 && idade <= 8){
            System.out.println("Pessoa na infância");
        }
        else if (idade >= 9 && idade <= 13) {
            System.out.println("Pessoa na pré-adolescência");
        }
        else if (idade >= 14 && idade <= 17) {
            System.out.println("Pessoa na adolescência");
        }
        else if (idade >= 18 && idade <= 65) {
            System.out.println("Pessoa adulta");
        }
        else{
            System.out.println("Pessoa idosa");
        }
    }
}
