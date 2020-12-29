package logica;

import java.text.NumberFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public abstract class Vehiculo implements Comparable<Vehiculo> {

	protected String marca;
	protected String modelo;
	protected double precio;

	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	@Override
	public int compareTo(Vehiculo otro) {
		return (int) (this.precio - otro.precio);
	}

	public String stringMarcaModelo() {
		return this.marca + " " + this.modelo;
	}

	public String precioAString() {
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		String  formatoAleman =format.format(this.precio);
		return "$"+formatoAleman.substring(0,formatoAleman.length()-2);
	}
	
	public static void imprimirArreglo(Collection<Vehiculo> vehiculos) {
		vehiculos.stream().forEach(System.out::println);
	}
	
	public static Vehiculo masCaro(Collection<Vehiculo> vehiculos) {
		return Collections.max(vehiculos).clone();
	}

	public static Vehiculo masBarato(Collection<Vehiculo> vehiculos){
		return Collections.min(vehiculos).clone();
	}
	
	public static Vehiculo contieneLetraY(Collection<Vehiculo> vehiculos) {
		for(Vehiculo v : vehiculos) {
			if(v.modelo.contains("Y")) {
				return v.clone();
			}
		}
		return null;
	}
	
	@Override
	public abstract String toString();
	
	@Override
	public abstract Vehiculo clone();
}
