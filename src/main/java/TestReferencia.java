public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(2);
        //primeraCuenta.saldo = 200;

        Cuenta segundaCuenta = primeraCuenta;
        //segundaCuenta.saldo = 100;

        System.out.println(primeraCuenta.getSaldo());
        System.out.println(segundaCuenta.getSaldo());

        //segundaCuenta.saldo += 400;
        System.out.println(primeraCuenta.getSaldo());

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if(primeraCuenta == segundaCuenta) {
            System.out.println("Las cuentas son iguales, son el mismo objeto.");
        } else {
            System.out.println("Las cuentas son diferentes, son objetos distintos.");
        }
    }
}
