import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite o agência da conta: ");
            String agenciaConta = scanner.nextLine();

            System.out.println("Por favor, digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o saldo do cliente: R$");
            double saldoConta = scanner.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e \nseu saldo R$%.2f já está disponível para saque",nomeCliente, agenciaConta, numeroConta,saldoConta);

            scanner.nextLine();
            
            System.out.println("\nDeseja cadastrar outro usuario? [S/N] ");
            String continuar = scanner.nextLine();

            if(continuar.equalsIgnoreCase("N")){
                break;
            }
        } while (true);

        scanner.close();
    }
}
