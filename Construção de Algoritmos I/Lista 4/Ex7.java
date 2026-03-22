import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double peso, altura, imc;
        
        System.out.print("Digite o seu peso: ");
        peso = sc.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        
        imc = peso / (altura * altura);
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso");
        }
        else{
            System.out.println("Obeso");
        }
    }
}
