public class Main {
    public static void main(String[] args) {
        // Crear una cuenta
        Cuenta cuenta = new Cuenta("Juan Pérez", 1000.0);

        // Mostrar los datos de la cuenta
        cuenta.mostrar();

        // Realizar un ingreso
        cuenta.ingresar(500.0);

        // Mostrar los datos actualizados de la cuenta
        cuenta.mostrar();

        // Realizar un retiro
        cuenta.retirar(200.0);

        // Mostrar los datos actualizados de la cuenta
        cuenta.mostrar();
    }
}
