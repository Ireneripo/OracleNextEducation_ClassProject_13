public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total = 0;

    public Cuenta(int agencia) {
        if (agencia <= 0) {
            System.out.println("No se permite 0.");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;

        System.out.println("Se han creado "
                + total + " cuentas.");
    }

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

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}