import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("---------- DIGITAL BANK ---------");
        System.out.println("---------------------------------\n");

        System.out.print("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();


        System.out.print("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        ContaModel conta = new ContaModel(nomeCliente, agencia, numero, saldo);

        System.out.println(conta);
    }
}
