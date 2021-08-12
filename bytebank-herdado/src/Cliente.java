
public class Cliente implements Autenticavel {

    private AutenticacaoUtil auth;

    public Cliente()    {
        this.auth =  new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha)    {
      this.auth.setSenha(senha);
    }
    @Override
    public boolean autentica(int senha) {
        return this.auth.autentica(senha);
    }
}
