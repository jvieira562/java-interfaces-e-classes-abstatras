
public class FuncionarioAutenticavel extends Funcionario {

	private int senha;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
