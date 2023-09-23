import java.util.Random;

public class Cuenta {
    private String titular;
    private double cantidad;
    private long numeroDeCuenta;

    // Constructor
    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.titular = nombreDelTitular;
        this.cantidad = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroDeCuenta();
    }

    // Getters y setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    // Método para mostrar los datos de la cuenta
    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de Cuenta: " + numeroDeCuenta);
        System.out.println("Saldo: " + cantidad);
    }

    // Método para ingresar saldo a la cuenta
    public void ingresar(double saldoIngresado) {
        if (saldoIngresado > 0) {
            cantidad += saldoIngresado;
        }
    }

    // Método para retirar saldo de la cuenta
    public void retirar(double saldoRetirar) {
        if (saldoRetirar > 0) {
            if (cantidad >= saldoRetirar) {
                cantidad -= saldoRetirar;
            } else {
                System.out.println("Fondos insuficientes");
            }
        }
    }

    // Método privado para generar un número de cuenta aleatorio
    private long generarNumeroDeCuenta() {
        Random random = new Random();
        return Math.abs(random.nextLong());
    }
}