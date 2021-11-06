public class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;

  private static int total = 0;

  public Conta(int agencia, int numero) {
    Conta.total++;
    this.agencia = agencia;
    this.numero = numero;
  }

  public void deposita(double valor) {
    if (valor <= 0)
      return;
    this.saldo += valor;
  }

  public void saca(double valor) {
    if (valor > this.saldo) {
      throw new SaldoInsuficienteException("Insuficiente | Saldo: " + this.saldo + ", Valor: " + valor);
    }

    this.saldo -= valor;
  }

  public void transfere(double valor, Conta destino) {
    this.saca(valor);
    destino.deposita(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if (numero <= 0)
      return;
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (numero <= 0)
      return;
    this.agencia = agencia;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}