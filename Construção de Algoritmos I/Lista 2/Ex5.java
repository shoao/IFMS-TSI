// Implemente um algoritmo que solicite que
// o(a) usuário(a) informe um número inteiro 
// n, calcule e exiba na saída o valor de n2.

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, res;

        System.out.print("Entre com um numero: ");
        num = sc.nextInt();

        res = num * num;
        System.out.println("O resultado do numero ao quadrado é: " + res);
    }

}
