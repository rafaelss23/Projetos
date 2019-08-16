package db;

import java.sql.SQLException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws SQLException {

		int p;

		Scanner sc = new Scanner(System.in);
		System.out.println(" 			Seja bem-vindo ao programa Umbrela Corporation ");
		System.out.println(
				"===============================================================================================================");
		System.out.println("Id do Departamento ja Cadastrado");
		Departaments.Tabela();
		System.out.println(
				"===============================================================================================================");
		System.out.print(" Escolha o numero para cadastro ou consulta : ");
		System.out.println(" 1- Departamento //" + " 2- Produtos //" + " 3- Lista Departamentos //"
				+ " 4- Lista Produto // " + "5- Vendedor");
		p = sc.nextInt();

		System.out.println("====================================================================================================");
		if (p == 1) {
			Departaments.CadastroDp();

		} else if (p == 2) {
			Produto.CadastroProduto();

		} else if (p == 3) {
			System.out.println("Departamentos atualmente Cadastrados : ");
			Departaments.Tabela();

		} else if (p == 4) {
			System.out.println("Produtos atualmente cadastrados :");
			Produto.Tabela();

		} else if (p == 5) {
			Vendedor.Funcionario();
		}

		else {
			System.out.println(" Opção Invalida ! ");

			DB.closeConnection();

		}
		sc.close();

	}
}
