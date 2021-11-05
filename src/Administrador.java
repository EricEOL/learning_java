public class Administrador extends Funcionario implements Autenticavel{
  
  private AutenticacaoUtil autenticacao;

  public Administrador() {
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

  @Override
  public double getBonificacao() {
    return 50;
  }
}
