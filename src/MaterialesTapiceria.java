
// Clase MaterialesTapiceria
class MaterialesTapiceria extends Material {
    private String material;
    private String color;
    private boolean resistenteAlAgua;

    public MaterialesTapiceria(String nombre, String tipo, double precio, int cantidadDisponible,
                               String material, String color, boolean resistenteAlAgua) {
        super(nombre, tipo, precio, cantidadDisponible);
        this.setMaterial(material);
        this.setColor(color);
        this.setResistenteAlAgua(resistenteAlAgua);
    }

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isResistenteAlAgua() {
		return resistenteAlAgua;
	}

	public void setResistenteAlAgua(boolean resistenteAlAgua) {
		this.resistenteAlAgua = resistenteAlAgua;
	}

    // Puedes agregar métodos adicionales específicos para materiales de tapicería si es necesario
}