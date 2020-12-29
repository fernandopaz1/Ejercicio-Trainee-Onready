package logica;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	
	private static ArrayList<Vehiculo> cargarVehiculos() {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

		vehiculos.add(new Auto("Peugeot", "206", 4, 200000.0));
		vehiculos.add(new Moto("Honda", "Titan", "125cc", 60000.0));
		vehiculos.add(new Auto("Peugeot", "208", 5, 250000.0));
		vehiculos.add(new Moto("Yamaha", "YBR", "160cc", 80500.5));

		return vehiculos;
	}

	public static void main(String[] args) {

		ArrayList<Vehiculo> vehiculos = cargarVehiculos();

		Vehiculo.imprimirArreglo(vehiculos);

		System.out.println("=============================");

		System.out.println("Veh\u00edculo m\u00e1s caro: " + Vehiculo.masCaro(vehiculos).stringMarcaModelo());
		System.out.println("Veh\u00edculo m\u00e1s barato: " + Vehiculo.masBarato(vehiculos).stringMarcaModelo());

		Vehiculo modeloConY = Vehiculo.contieneLetraY(vehiculos);
		if (modeloConY != null) {
			System.out.println("Veh\u00edculo que contiene en el modelo la letra ‘Y’: " + modeloConY.stringMarcaModelo()
					+ " " + modeloConY.precioAString());
		} else {
			System.out.println("No hay Veh\u00edculos cuyo modelo tenga la letra ‘Y’");
		}

		System.out.println("=============================");

		System.out.println("Veh\u00edculos ordenados por precio de mayor a menor: ");
		
		vehiculos.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(actual -> System.out.println(actual.stringMarcaModelo()));
	}

}
