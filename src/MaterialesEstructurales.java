
// Clase MaterialesEstructurales
class MaterialesEstructurales extends Material {
    private double longitud;
    private double ancho;
    private double altura;
    private double resistencia;

    public MaterialesEstructurales(String nombre, String tipo, double precio, int cantidadDisponible,
                                   double longitud, double ancho, double altura, double resistencia) {
        super(nombre, tipo, precio, cantidadDisponible);
        this.setLongitud(longitud);
        this.setAncho(ancho);
        this.setAltura(altura);
        this.setResistencia(resistencia);
    }

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

    // Puedes agregar métodos adicionales específicos para materiales estructurales si es necesario
}

