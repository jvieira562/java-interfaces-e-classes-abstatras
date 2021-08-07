
public class SistemaInterno {

	private int senha = 4321;

	public void autentica(FuncionarioAutenticavel f) {
		boolean autentica = f.autentica(this.senha);
		if (autentica) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}

}
