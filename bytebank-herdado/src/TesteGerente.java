
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		SistemaInterno si = new SistemaInterno();

		g1.setSenha(4321);
		si.autentica(g1);

	}

}
