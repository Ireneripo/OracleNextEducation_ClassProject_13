public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(2);
        //primeraCuenta.saldo = 1000;
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(2);
        //segundaCuenta.saldo = 500;
        System.out.println(segundaCuenta.getSaldo());
        System.out.println(primeraCuenta.getAgencia());

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if(primeraCuenta == segundaCuenta) {
            System.out.println("Las cuentas son iguales, son el mismo objeto.");
        } else {
            System.out.println("Las cuentas son diferentes, son objetos distintos.");
        }
    }
}
