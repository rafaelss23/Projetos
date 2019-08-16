package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Departaments extends Loja {

	public static void CadastroDp() throws SQLException {

		List<Loja> dp = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		int z;

		Connection conn = null;
		PreparedStatement st = null;

		System.out.println("Quantos departamento quer cadastrar: ");
		z = in.nextInt();

		try {
			conn = DB.getConnection();
			Loja loja = new Loja();
			for (int i = 0; i < z; i++) {
				st = conn.prepareStatement("Insert into departamento " + "(Nome)" + "Values " + "(?)");
				System.out.println(" Informe o nome do Departmento: ");
				Nome_Dp = sc.next();
				st.setString(1, Nome_Dp);
				int rowsAffected = st.executeUpdate();
				dp.add(loja);

				System.out.println("Cadastrado ! " + " Departamentos cadastrados: " + rowsAffected);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		sc.close();
		in.close();
	}

	public static void Tabela() throws SQLException {
		ResultSet rs = null;
		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			st = conn.createStatement();

			rs = st.executeQuery("select * from departamento");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + "," + rs.getString("nome"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
