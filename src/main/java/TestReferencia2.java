public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("43048233");
        diego.setTelefono("0674839403");

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.setAgencia(1);
        cuentaDeDiego.setTitular(diego);

        System.out.println(cuentaDeDiego.getTitular().getDocumento());
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());

    }
}
