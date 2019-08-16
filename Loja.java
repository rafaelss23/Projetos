package db;

public class Loja {

	protected static String Nome_Dp = null;

	protected static String NomePr;
	protected static int precoP;
	protected static int IdDp;

	public static int getIdDp() {
		return IdDp;
	}

	public static void setIdDp(int idDp) {
		IdDp = idDp;
	}

	public String getNomePr() {
		return NomePr;
	}

	public double getPrecoP() {
		return precoP;
	}

	public String getNome_Dp() {
		return Nome_Dp;
	}

	public void setNome_Dp(String nome_Dp) {
		Nome_Dp = nome_Dp;
	}
}
