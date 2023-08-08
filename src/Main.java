// Clase principal para probar el programa
public class Main {
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos de materiales
        MaterialesEstructurales madera = new MaterialesEstructurales("Madera", "Estructural", 25.0, 50,
                                                                    1.2, 0.1, 1.5, 100);
        // Acceder a los atributos y métodos de los materiales
        System.out.println("Material: " + madera.getNombre());
        System.out.println("Tipo: " + madera.getTipo());
        System.out.println("Precio: $" + madera.obtenerPrecio());
        System.out.println("Cantidad Disponible: " + madera.getCantidadDisponible());
        System.out.println("Longitud: " + madera.getLongitud() + " m");
        System.out.println("Ancho: " + madera.getAncho() + " m");
        System.out.println("Altura: " + madera.getAltura() + " m");
        System.out.println("Resistencia: " + madera.getResistencia() + " kg");

        // Puedes realizar operaciones similares para los otros tipos de materiales
    }
}