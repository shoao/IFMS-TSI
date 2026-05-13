
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        float notas = 0;
        float nota = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 10 + 1; i++) {
            System.out.print("Digite a nota: ");
            nota = sc.nextFloat();

            notas += nota;
        }

        System.out.println("Soma das notas: " + notas);
        System.out.println("Media: " + (notas / 10));

    }

}
