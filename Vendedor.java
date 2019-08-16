package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Vendedor extends Loja  {
	private static String nome_v;
	private static String email;
	private static String nascimento;
	private static float salario;
	private static int IdDp;
	
	public static void Funcionario () throws SQLException {
		Scanner sc = new Scanner (System.in);
		
		Connection conn = null;
		PreparedStatement st = null;
	
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("insert into vendedor" + "(nome_v, email, nascimento, salario, DepartmentoId)"+ "Values"+ "(?, ?, ?, ?, ?)");
			System.out.println("Informe o nome do Vendedor: ");
			nome_v = sc.nextLine();
			System.out.println("Informe email: ");
			email = sc.nextLine();
			System.out.println("Informe Nascimento: ");
			nascimento = sc.nextLine();
			System.out.println("Informe salario: ");
			salario = sc.nextFloat();
			System.out.println("Informe Id Departamento");
			IdDp = sc.nextInt();
			st.setString(1, nome_v);
			st.setString(2, email);
			st.setString(3, nascimento);
			st.setFloat(4, salario);
			st.setInt(5, IdDp);
			int rowsAffected = st.executeUpdate();
			
			System.out.println(" Funcionario Cadastrado !" + rowsAffected);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		
		
	}

	public static String getNome_v() {
		return nome_v;
	}

	public static void setNome_v(String nome_v) {
		Vendedor.nome_v = nome_v;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Vendedor.email = email;
	}

	public static String getNascimento() {
		return nascimento;
	}

	public static void setNascimento(String nascimento) {
		Vendedor.nascimento = nascimento;
	}

	public static float getSalario() {
		return salario;
	}

	public static void setSalario(float salario) {
		Vendedor.salario = salario;
	}

	public static int getIdDp() {
		return IdDp;
	}

	public static void setIdDp(int idDp) {
		IdDp = idDp;
	}
	}
