public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    // Este método no retorna ningún valor
    // (por eso usamos "void").
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Este método nos retorna un valor booleano.
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
}