import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int potencia, consumo, conforto;
        double media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota de Potência do veiculo (0 - 10): ");
        potencia = sc.nextInt();
        
        
        System.out.print("Digite a nota de Consumo do veiculo (0 - 10): ");
        consumo = sc.nextInt();

        System.out.print("Digite a nota de Conforto do veiculo (0 - 10): ");
        conforto = sc.nextInt();
        
        media = (potencia + consumo + conforto) / 3;
        System.out.println("Média: " + media);
        
        if (media >= 9 && media <= 10){
            System.out.println("Carro Excelente!");
        }
        else if (media >= 7 && media < 9){
            System.out.println("Carro Bom!");
        }
        else if (media >= 5 && media < 7){
            System.out.println("Carro Mediano.");
        }
        else if (media < 5){
            System.out.println("Carro ruim.");
        }
        
        
    }
}
