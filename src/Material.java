// Clase Material
class Material {
    private String nombre;
    private String tipo;
    private double precio;
    private int cantidadDisponible;

    public Material(String nombre, String tipo, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void actualizarCantidad(int nuevaCantidad) {
        cantidadDisponible = nuevaCantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}