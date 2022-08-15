public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(2);
        cuentaDeDiego.setTitular(new Cliente());
        cuentaDeDiego.getTitular().setNombre("Diego");

        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
}
