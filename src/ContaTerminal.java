import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
	
	Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.print("Por favor, Digite o seu nome : ");
	String nomeDoCliente = terminal.nextLine();
	
	System.out.print("Digite o número da Agência : ");
	String numeroDaAgencia = terminal.nextLine();
	
	System.out.print("Por favor, digite o número da conta: ");
	int numeroDaConta = terminal.nextInt();
	
	
	System.out.print("Por favor, digite o saldo da conta : ");
	float saldo = terminal.nextFloat();
	
	System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"
		+ " sua agência é %s, conta %d e seu saldo %.2f\n"
		+ "já está disponível para saque.",nomeDoCliente,numeroDaAgencia, numeroDaConta, saldo);
	

    }

}
