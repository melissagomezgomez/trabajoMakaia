public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona = new Persona("Juan Pérez", 25, "123456789");

        // Mostrar los datos de la persona
        persona.mostrar();

        // Verificar si es mayor de edad
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}
