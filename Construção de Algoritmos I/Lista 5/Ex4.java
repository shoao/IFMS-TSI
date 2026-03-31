import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args){
        int nivel, horas;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o nivel do professor: ");
        nivel = sc.nextInt();
        
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        horas = sc.nextInt();
        
        switch (nivel){
            case 1:
                System.out.println("Salário: " + (horas * 12) );
                break;
                
            case 2:
                System.out.println("Salario: " + (horas * 17) );
                break;
                
            case 3:
                System.out.println("Salario: " + (horas * 25) );
                break;
                
            default:
                System.out.println("Não foi possivel encontrar essa opção");
                break;
        }
    }
    
}
