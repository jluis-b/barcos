package practicaPuerto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GestionPuerto {
	static Barco[] atraques;
	public static void main(String[] args) {
		atraques = new Barco[60];

		atracarBarco();
		calcularRatio();
		calcularTiempoVida();
		calcularValorEconomico();
		calcularValorEconomico10();
		mostrarInfo();
	}

	/**
	 * Metodo que crea los barcos y los asigna al array
	 */
	public static void atracarBarco() {

		Barco barco1 = new BarcoVelero("AAA-111", 22.33, 10, 22, 33, 25.33, 33.5); 
		Barco barco2 = new BarcoVelero("BBB-222", 25.53, 9, 20, 10, 35.23, 32.5); 
		Barco barco3 = new BarcoVelero("CCC-333", 10.15, 5, 15, 5, 45.63, 23.5); 
		Barco barco4 = new BarcoVelero("DDD-444", 34.33, 20, 44, 15, 15.13, 43.5); 
		Barco barco5 = new BarcoVelero("EEE-555", 42.53, 25, 50, 30, 75.33, 53.5); 
		
		Barco barco6 = new BarcoMercante("FFF-666", 25.33, 15, 30, 10, 75); 
		Barco barco7 = new BarcoMercante("GGG-777", 35.51, 20, 35, 15, 155); 
		Barco barco8 = new BarcoMercante("HHH-888", 45.32, 30, 45, 45, 255); 
		Barco barco9 = new BarcoMercante("III-999", 15.40, 10, 15, 25, 55); 
		Barco barco10 = new BarcoMercante("JJJ-101010", 10.13, 25, 10, 10, 35); 
		
		atraques[0] = barco1;
		atraques[1] = barco2;
		atraques[2] = barco3;
		atraques[3] = barco4;
		atraques[4] = barco5;
		atraques[5] = barco6;
		atraques[6] = barco7;
		atraques[7] = barco8;
		atraques[8] = barco9;
		atraques[9] = barco10;
		}
	
	/**
	 * Recorre el array y llama al metodo calcular ratio
	 */
	private static void calcularRatio() {
		for(int i = 0; i < atraques.length; i++) {			
			if(atraques[i] != null) {	
				atraques[i].calcularRatio();
			}
		}
	}

	/**
	 * Recorre el array y llama al metodo calcular tiempo de vida
	 */
	private static void calcularTiempoVida() {
		for(int i = 0; i < atraques.length; i++) {			
			if(atraques[i] != null) {	
				atraques[i].calcularTiempoVida();
			}
		}
	}
	
	/**
	 * Recorre el array y llama al metodo calcular valor economico
	 */
	private static void calcularValorEconomico() { 
		for(int i = 0; i < atraques.length; i++) {
			if(atraques[i] != null) {	
			 atraques[i].calcularValorEconomico();
			}
		}
	}
	
	/**
	 * Recorre el array y llama al metodo calcular valor economico dentro de 10 años 
	 */
	private static void calcularValorEconomico10() {
		for(int i = 0; i < atraques.length; i++) {
			if(atraques[i] != null) {	
			 atraques[i].calcularValorEn10Anios();
			}
		}
	}
	
	/**
	 * Recorre el array y llama al metodo mostrar info para cada barco
	 */
	public static void mostrarInfo() {
		for(int i = 0; i < atraques.length; i++) {			
			if(atraques[i] != null) {	
				atraques[i].mostrarInfo();
			}
		}
		}
}
