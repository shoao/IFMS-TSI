import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int digito;
        
        System.out.print("Digite o ultimo digito da placa: ");
        digito = sc.nextInt();
        
        switch (digito){
            case 1:
            case 2:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: ABRIL");
                break;
            
            case 3:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: MAIO");
                break;
                
            case 4:
            case 5:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: JUNHO");
                break;
                
            case 6:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: JULHO");
                break;
                
            case 7:
            case 8:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: AGOSTO");
                break;
                
            case 9:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: SETEMBRO");
                break;
                
            case 0:
                System.out.println("MÊS DO PAGAMENTO DO LICENCIAMENTO: OUTUBRO");
                break;
                
            default:
                System.out.println("Não foi possivel identificar.");
        }
        
    }
    
}
