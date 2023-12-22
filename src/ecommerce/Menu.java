package ecommerce;

import ecommerce.util.Cores;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int option, paymentMethod;
		Boolean loginSuccess;
		String email, password, address;
		int[] wishList = new int[0];
		
		System.out.println(wishList);

		while (true) {
			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_CYAN_BACKGROUND);
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("           E-COMMERCE MARILIA           ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("           1 - Fazer Login              ");
			System.out.println("                                        ");
			System.out.println("           2 - Fazer Cadastro           ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("Qual a opção desejada?                  ");
			System.out.println("                                        ");
			System.out.println(Cores.TEXT_RESET);

			option = input.nextInt();
			input.nextLine(); // Limpando cache

			switch (option) {

			case 1 -> {
				do {
					System.out.println("\nDigite seu email: ");
					email = input.nextLine();
				} while (!(email.contains("@") && email.contains(".com")));

				System.out.println("\nDigite sua senha: ");
				password = input.nextLine();

				System.out.println("\n****************************************");
				System.out.println("Login feito com sucesso.\n\nBem vindo(a)!");

				break;
			}
			case 2 -> {
				do {
					System.out.println("\nDigite seu email: ");
					email = input.nextLine();
				} while (!(email.contains("@") && email.contains(".com")));

				System.out.println("\nDigite sua senha: ");
				password = input.nextLine();

				System.out.println("\nDigite seu endereço (Rua, Nº, Apt): ");
				address = input.nextLine();
				
				System.out.println("\n****************************************");
				System.out.println("Conta criada com sucesso.\n\nBem vindo(a)!");
				
				break;
			}
			default -> {
				System.out.println("Opção Inválida");
			}

			}

		}

	}
}