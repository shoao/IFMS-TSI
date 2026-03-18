import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double salarioBruto, salarioNovo, salarioLiq;
        
        System.out.println("Digite o valor bruto do salario: ");
        salarioBruto = sc.nextDouble();
        
        salarioNovo = salarioBruto * 1.30;
        System.out.println("Salario com reajuste: " + salarioNovo);
        
        salarioLiq = salarioNovo * 0.79;
        
        System.out.println("Salario novo com desconto de 21%: " + salarioLiq);
    }
}
