public class Gerente extends Funcionario implements Autenticavel {
	/*
	 * * Classe Gerente È filha da superclasse funcionario e assina a classe
	 * Autenticavel
	 */

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o m√©todo de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
