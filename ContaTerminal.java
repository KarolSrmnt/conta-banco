package edu.dio.contabanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		double saldo = 237.48;

		System.out.println("Olá, seja bem-vindo(a/e) ao banco! \n");
		
		System.out.println("Por favor, digite o seu nome completo: ");
		String nomeCompletoCliente = input.nextLine();
		System.out.println("O dado está correto? [s/n] " + nomeCompletoCliente);
		String confirmacao = input.next();
		if(confirmacao.equalsIgnoreCase("n")) {
			System.out.println("Por favor, digite o seu nome completo novamente: ");
			nomeCompletoCliente = input.nextLine();
		}
		
		System.out.print("Por favor, digite o número da Agência: ");
		System.out.println();
		String agenciaBancaria = input.next();
		System.out.println("O dado está correto? [s/n] " + agenciaBancaria);
		confirmacao = input.next();
		if(confirmacao.equalsIgnoreCase("n")) {
			System.out.println("Por favor, digite novamente o número da Agência: ");
			agenciaBancaria = input.next();
		}
		
		System.out.println("Por favor, digite o número da Conta: ");
		int numeroDaConta = input.nextInt();
		System.out.println("O dado está correto? [s/n] " + numeroDaConta);
		confirmacao = input.next();
		if(confirmacao.equalsIgnoreCase("n")) {
			System.out.println("Por favor, digite novamente o número da Conta: ");
			numeroDaConta = input.nextInt();
		}
		
		String dadosDaConta = "Olá " + nomeCompletoCliente
				+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", número "
				+ numeroDaConta;

		System.out.println("Deseja consultar o seu saldo? [s/n]");
		if (input.next().equalsIgnoreCase("s")) {
			dadosDaConta += ", e seu saldo é R$" + saldo + ", já está disponível para saque";
		}
		
		System.out.println("----------");
		System.out.println(dadosDaConta);
		System.out.println("----------");

		input.close();
	}

}