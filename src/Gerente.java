public class Gerente extends Funcionario implements Autenticavel {

  private AutenticacaoUtil autenticacao;

  public Gerente() {
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
    return super.getSalario();
  }
}
