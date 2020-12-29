package logica;

public class Auto extends Vehiculo {

	private int puertas;

	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;

	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " + puertas + " // Precio: "
				+ precioAString();
	}

	@Override
	public Vehiculo clone() {
		return new Auto(marca, modelo, puertas, precio);
	}
}
