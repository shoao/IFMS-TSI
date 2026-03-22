import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double preco, juros;
        int condicao;

        System.out.print("Digite o valor do preço do produto: ");
        preco = sc.nextDouble();

        System.out.println("-- Escolha a condição de pagamento --");
        System.out.println("1 - À vista em dinheiro ou pix, recebe 15% de desconto.");
        System.out.println("2 - À vista no cartão de crédito, recebe 5% de desconto .");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros.");
        System.out.println("4 - Em três vezes, preço normal de etiqueta mais juros simples de 10%.");
        System.out.print(": ");
        condicao = sc.nextInt();

        if (condicao == 1){
            preco = preco * 0.85;
            System.out.println("Preço a ser pago pelo produto: " + preco);
        }
        else if (condicao == 2) {
            preco = preco * 0.95;
            System.out.println("Preço a ser pago pelo produto: " + preco);
        }
        else if (condicao == 3) {
            preco = preco / 2.0;
            System.out.println("Preço a ser pago pelo produto:");
            System.out.println("Parcela 1: " + preco);
            System.out.println("Parcela 2: " + preco);
        }
        else if (condicao == 4) {
            juros = preco * 0.1;
            preco = preco + juros;
            System.out.println("preço a ser pago pelo produto:");
            System.out.println("Valor do juros: " + juros);
            System.out.println("Primeira parcela: " + preco);
            System.out.println("Segunda parcela: " + preco);
            System.out.println("Terceira parcela: " + preco);

        }
    }
}
