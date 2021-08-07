
public class TesteSistema {

	public static void main(String[] args) {

		SistemaInterno si = new SistemaInterno();
		Gerente victor = new Gerente();
		Administrador vieira = new Administrador();
		Designer jose = new Designer();

		victor.setSenha(4321);
		vieira.setSenha(43211);

		si.autentica(vieira);
		si.autentica(victor);
//		si.autentica(jose);
	}

}
