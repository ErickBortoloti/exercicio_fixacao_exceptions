package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DominioExceptions;

public class Principal {

	public static void main(String[] args) throws DominioExceptions {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Dados da conta");
		try {
		System.out.print("Número da conta: ");
		int c = teclado.nextInt();
		System.out.print("Nome: ");
		String n = teclado.next();
		System.out.print("Saldo inicial: ");
		double i = teclado.nextDouble();
		System.out.print("Limite de saque: ");
		double l = teclado.nextDouble();
		
		Conta conta = new Conta(c, n, i, l);
		
		System.out.println();
		System.out.print("Digite o valor do que deseja sacar: ");
		double valor = teclado.nextDouble();
		

		conta.saque(valor);
		System.out.println(conta);
		}
		catch (InputMismatchException e) {
			System.out.println("Erro de digitação!");
		}
		catch (DominioExceptions e) {
			System.out.println(e.getMessage());
		}


		

	}

}
