package ecommerce;

import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Camiseta;
import ecommerce.model.Casaco;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		// Criando 2 produtos base
		Camiseta camiseta1 = new Camiseta("Camiseta Preta Básica", produtos.gerarIdProduto(), 79.90f, "Preto", 1, "P",
				"T-Shirt");
		produtos.cadastrar(camiseta1);

		Casaco casaco1 = new Casaco("Casaco Branco com Capuz", produtos.gerarIdProduto(), 160.00f, "Branco", 2, "M",
				true);
		produtos.cadastrar(casaco1);

		Scanner input = new Scanner(System.in);

		int option, option2, category;
		String option3;
		int chosenProductId;
		String email,  password, address;

		// atributos pra adicionar mais pra frente no projeto (Quero continuar fazendo)
			// int paymentMethod;
			// Boolean loginSuccess;
			// Boolean wantToBuy;

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
				} while (!(email.contains("@") && (email.endsWith(".com") || email.endsWith(".br"))));

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
				} while (!(email.contains("@") && (email.endsWith(".com") || email.endsWith(".br"))));

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

			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("           E-COMMERCE MARILIA           ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("   1 - Escolher categoria de produtos   ");
			System.out.println("                                        ");
			System.out.println("   2 - Ver todos os produtos            ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("Qual a opção desejada?                  ");
			System.out.println("                                        ");

			option2 = input.nextInt();
			input.nextLine();

			if (option2 == 1) {
				System.out.println("\n****************************************");
				System.out.println("\nQual a categoria que deseja?: ");

				do {
					System.out.println("\n1- Camiseta");
					System.out.println("\n2- Casaco\n");
					category = input.nextInt();
					input.nextLine();

					produtos.listarProdutosCategoria(category);

					if (category != 1 && category != 2) {
						System.out.println("\n\nCategoria inválida.\n\n");
					}

				} while (category != 1 && category != 2);
			} else {
				produtos.listarTodos();
			}

			System.out.println("\nDeseja comprar algum produto? (S/N)");
			option3 = input.nextLine();

			if (option3.equalsIgnoreCase("S")) {
				System.out.println("\nDigite o ID do produto que deseja comprar: ");
				chosenProductId = input.nextInt();
				produtos.buyProduct(chosenProductId);
			} else if (option3.equalsIgnoreCase("N")) {
				System.out.println("\nPoxa, tudo bem.\nVolte sempre!");
			}

		}

	}
}