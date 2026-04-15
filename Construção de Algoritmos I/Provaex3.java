public class Ex3 {
    public static void main(String[] args) {
        
         int ingressosTotal = 30000;
         
         double ingressoArena, ingressoFront, ingressoCamarote, ingressoExperience; 
         double valorDescontos = 0, valorCache = 0;
         
         // usei long porque double não consegue armazenar um numero tão grande
         long valorBruto = 0;
         
         ingressoArena = (0.76) * ingressosTotal;
         ingressoFront = (0.12) * ingressosTotal;
         ingressoCamarote = (0.08) * ingressosTotal;
         ingressoExperience = (0.04) * ingressosTotal;
         
         System.out.println("Total de ingressos Arena: " + ingressoArena);
         System.out.println("Total de ingressos Front-Stage: " + ingressoFront);
         System.out.println("Total de ingressos Camarote: " + ingressoCamarote);
         System.out.println("Total de ingressos Experience: " + ingressoExperience);
         
         ingressoArena = ingressoArena * 285.00;
         ingressoFront = ingressoFront * 595.00;
         ingressoCamarote = ingressoCamarote * 890.00;
         ingressoExperience = ingressoExperience * 1500.00;
         
         valorBruto += (ingressoArena + ingressoFront + ingressoCamarote + ingressoExperience);
         
         System.out.println("Valor total arrecadado: " + valorBruto + "R$");
         
         valorDescontos = (0.38) * valorBruto;
         
         System.out.println("Valor total arrecadado com desconto de 62% dos custos: " + valorDescontos + "R$");
         
         valorCache = (0.11) * valorBruto;
         
         System.out.println("Valor do cachê da banda: " + valorCache + "R$");
         
    }
}
