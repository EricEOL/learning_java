public class Cliente implements Autenticavel {
  
  private AutenticacaoUtil autenticacao;

  public Cliente() {
    this.autenticacao = new AutenticacaoUtil();
  }

  @Override
  public void setSenha(int senha) {
    this.autenticacao.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticacao.autentica(senha);
  }
}
