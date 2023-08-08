// Clase MaterialesRevestimiento
class MaterialesRevestimiento extends Material {
    private String color;
    private String textura;
    private String durabilidad;

    public MaterialesRevestimiento(String nombre, String tipo, double precio, int cantidadDisponible,
                                   String color, String textura, String durabilidad) {
        super(nombre, tipo, precio, cantidadDisponible);
        this.setColor(color);
        this.setTextura(textura);
        this.setDurabilidad(durabilidad);
    }

	public void MaterialesRevestimiento1(String nombre, String tipo, double precio, int cantidadDisponible, String color2,
			String textura2, String durabilidad2) {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public String getDurabilidad() {
		return durabilidad;
	}

	public void setDurabilidad(String durabilidad) {
		this.durabilidad = durabilidad;
	}

    // Puedes agregar métodos adicionales específicos para materiales de revestimiento si es necesario
}
