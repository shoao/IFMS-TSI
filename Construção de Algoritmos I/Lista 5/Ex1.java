import java.util.Scanner;
import java.util.ArrayList;

// Não é IA prof, eu queria aprendar a usar lista aqui no Java >:(

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> meses = new ArrayList<String>();
        
        int opcao;

        
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");
        
        
        System.out.print("Digite o numero do mês: ");
        opcao = sc.nextInt();
        
        switch(opcao){
            
            case 1:
                System.out.println(meses.get(0));
                break;
                
            case 2:
                System.out.println(meses.get(1));
                break;
                
            case 3:
                System.out.println(meses.get(2));
                break;
                
            case 4:
                System.out.println(meses.get(3));
                break;
                
            case 5:
                System.out.println(meses.get(4));
                break;
                
            case 6:
                System.out.println(meses.get(5));
                break;
                
            case 7:
                System.out.println(meses.get(6));
                break;
                
            case 8:
                System.out.println(meses.get(7));
                break;
                
            case 9:
                System.out.println(meses.get(8));
                break;
                
            case 10:
                System.out.println(meses.get(9));
                break;
                
            case 11:
                System.out.println(meses.get(10));
                break;
                
            case 12:
                System.out.println(meses.get(11));
                break;
                
            default:
                System.out.println("Valor não encontrado");
                break;
        }
        

        

    }
}
