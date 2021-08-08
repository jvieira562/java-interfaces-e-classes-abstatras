
public class SistemaInterno {

	private int senha = 4321;

	public void autentica(Autenticavel fa) {
		boolean autentica = fa.autentica(this.senha);
		if (autentica) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}

}
