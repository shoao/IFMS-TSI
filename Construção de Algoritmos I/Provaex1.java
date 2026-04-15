import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        
        int ingresso, transporte;
        double valor = 0.00;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o código do ingresso: ");
        ingresso = sc.nextInt();
        
        switch (ingresso){
            case 85:
                valor = 285.0;
                System.out.println("Arena - R$285,00");
                break;
                
            case 86:
                valor = 595.0;
                System.out.println("Front-Stage - R$595,00");
                break;
                
            case 87:
                valor = 890.0;
                System.out.println("Camarote - R$890,00");
                break;
                
            case 88:
                valor = 1500.0;
                System.out.println("Experience - R$1500,00");
                break;
                
            default:
                System.out.println("Código não encontrado");
                break;
                
        }
        
        System.out.print("Insira o código do transporte que você deseja: ");
        transporte = sc.nextInt();
        
        switch (transporte) {
            case 92:
                valor += 199.99;
                System.out.println("Ônibus - R$199,99");
                break;
                
            case 93:
                valor += 250.00;
                System.out.println("Moto - R$250,00");
                break;
                
            case 94:
                valor += 499.99;
                System.out.println("Carro - R$499,99");
                break;
                
            case 95:
                valor += 4000.50;
                System.out.println("Helicóptero - R$4000,50");
                break;
                
            default:
                System.out.println("Código não encontrado");
                break;
                
        }
        
        System.out.println("Valor Total: R$" + valor);
        
    }
}
