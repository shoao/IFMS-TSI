import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        // Calculadora de CDB (imposto de renda)
        
        Scanner sc = new Scanner(System.in);
        
        double valor_bruto, resultado;
        int dias;
        
        System.out.print("Digite o valor bruto disponivel para resgate: ");
        valor_bruto = sc.nextDouble();
        
        System.out.print("Digite o tempo do investimento em dias: ");
        dias = sc.nextInt();
        
        if (dias >= 0 && dias <= 180){
            resultado = valor_bruto - ((22.5 / 100) * valor_bruto);
            System.out.println("Valor liquido a receber: " + resultado);
        }
        else if (dias >= 181 && dias <= 360){
            resultado = valor_bruto - ((20.0 / 100) * valor_bruto);
            System.out.println("Valor liquido a receber: " + resultado);
        }
        else if (dias >= 361 && dias <= 720){
            resultado = valor_bruto - ((17.5 / 100) * valor_bruto);
            System.out.println("Valor liquido a receber: " + resultado);
        }
        else if (dias > 720){
            resultado = valor_bruto - ((15.0 / 100) * valor_bruto);
            System.out.println("Valor liquido a receber: " + resultado);
        }
        else{
            System.out.println("Valor invalido");
        }
        
//        System.out.println((22.5 / 100) * 1000);
    }
}
