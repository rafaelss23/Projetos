package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Produto extends Loja {
	public static void CadastroProduto() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Scanner en = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			st = conn.prepareStatement("Insert into produto " + "(nome, Preço, DepartamentoId)" + "Values" + "(?, ?, ?)");
			System.out.println("Informe o nome do Produto: ");
			NomePr = sc.next();
			System.out.println("Informe o preço : ");
			precoP = en.nextInt();
			System.out.println("Informe o id Departamento: ");
			IdDp = sc.nextInt();
			st.setString(1, NomePr);
			st.setFloat(2, precoP);
			st.setInt(3, IdDp);
			int rowsAffected = st.executeUpdate();

			System.out.println("Cadastrado ! " + " Produto cadastrado: " + rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		} 

		sc.close();
		en.close();
	}
	
	public static void Tabela() throws SQLException {
		ResultSet rs = null;
		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			st = conn.createStatement();

			rs = st.executeQuery("select * from produto");

			while (rs.next()) {
				System.out.println("Seção : " + rs.getInt("DepartamentoId") + "," + " Produto: " + rs.getString("nome")+ ", " + " Preço : "+ rs.getFloat("Preço"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
	}
