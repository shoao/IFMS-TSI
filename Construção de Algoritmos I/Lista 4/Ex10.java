import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ra;
        double av1, av2, ml1, ml2;
        double b1, b2, mediaFinal;

        System.out.print("Digite o RA: ");
        ra = sc.nextInt();

        System.out.print("Digite AV1: ");
        av1 = sc.nextDouble();

        System.out.print("Digite ML1: ");
        ml1 = sc.nextDouble();

        System.out.print("Digite AV2: ");
        av2 = sc.nextDouble();

        System.out.print("Digite ML2: ");
        ml2 = sc.nextDouble();

        b1 = av1 * 0.8 + ml1 * 0.2;
        b2 = av2 * 0.8 + ml2 * 0.2;
        mediaFinal = (b1 + b2) / 2.0;

        System.out.println("RA: " + ra);
        System.out.println("Bimestre 1: " + b1);
        System.out.println("Bimestre 2: " + b2);
        System.out.println("Media Final: " + mediaFinal);

        if (mediaFinal >= 9){
            System.out.println("Conceito: A");
            System.out.println("Aprovado");
        }
        else if (mediaFinal >= 7.5 && mediaFinal < 9){
            System.out.println("Conceito: B");
            System.out.println("Aprovado");
        }
        else if (mediaFinal >= 6 && mediaFinal < 7.5){
            System.out.println("Conceito: C");
            System.out.println("Aprovado");
        }
        else if (mediaFinal >= 4 && mediaFinal < 6){
            System.out.println("Conceito: D");
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Conceito: E");
            System.out.println("Reprovado");
        }
    }
}