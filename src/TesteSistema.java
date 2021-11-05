public class TesteSistema {
  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    gerente.setSenha(2222);

    Administrador adm = new Administrador();
    adm.setSenha(2222);

    Cliente cliente = new Cliente();
    cliente.setSenha(3333);

    SistemaInterno sistema = new SistemaInterno();
    sistema.autentica(gerente);
    sistema.autentica(adm);
    sistema.autentica(cliente);
  }
}
