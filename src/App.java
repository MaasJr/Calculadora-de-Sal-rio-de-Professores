import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner valor = new Scanner(System.in);

        System.out.println("Me diga o seu nome");
        String nome = valor.nextLine();

        System.out.println("Informe o regime de pagamento");
        String regime = valor.nextLine();

        if (regime.equals("CLT")) {

            System.out.println("Qual o seu salário mensal?");
            double salarioCLT = valor.nextDouble();
            System.out.println(nome + ", o valor a receber será: " + "R$" + salarioCLT);

        } 
        
        else if (regime.equals("Horista")) {

            System.out.println("Informe o número de horas trabalhadas");
            double horasHorista = valor.nextDouble();
            System.out.println("Informe o valor da hora de trabalho");
            double valorHorista = valor.nextDouble();
            double valorReceberHorista = horasHorista * valorHorista;
            System.out.println(nome + ", o valor a receber é " + "R$" + valorReceberHorista);

        } 
        
        else if (regime.equals("PJ")) {

            System.out.println("Informe o valor do seu contrato");
            double contratoPJ = valor.nextDouble();
            System.out.println(nome + ", o valor a receber é " + "R$" + contratoPJ);

        }
        valor.close();

     }
}
