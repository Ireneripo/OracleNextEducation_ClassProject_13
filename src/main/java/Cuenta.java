public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    // Este método no retorna ningún valor
    // (por eso usamos "void").
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    // Este método nos retorna un valor booleano.
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}