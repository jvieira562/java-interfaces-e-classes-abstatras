
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		SistemaInterno si = new SistemaInterno();
		Administrador admin = new Administrador();

		admin.setSenha(4321);
		si.autentica(admin);

	}

}
