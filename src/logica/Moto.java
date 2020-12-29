package logica;

public class Moto extends Vehiculo {

	private String cilindrada;

	public Moto(String marca, String modelo, String cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;

	}

	@Override
	public String toString() {
		return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " + cilindrada + " // Precio: "
				+ this.precioAString();
	}

	@Override
	public Vehiculo clone() {
		return new Moto(marca, modelo, cilindrada, precio);
	}
}
