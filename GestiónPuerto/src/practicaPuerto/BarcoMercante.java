package practicaPuerto;

public class BarcoMercante extends Barco {
	private double carga;
	private double tiempoDeVida;
	private double valorEconomico;
	private double valorEconomico10Anios;
	private double MULTI_VALOR_ECONOMICO = 3500;
	private double DIVIDIR_VALOR_ECONOMICO_10 = 0.5;
	private double SUMA_ANIOS_10 = 10;
	
	/**
	 * Constructor sin parametros
	 */
	public BarcoMercante() {
		carga = 0;
	}
	
	/**
	 * Constructor con 6 parametros
	 * @param inMatricula del barco
	 * @param inMetrosEslora del barco
	 * @param inNumTripulantes del barco
	 * @param inNumPasajeros del barco
	 * @param inEdad del barco
	 * @param inCarga del barco
	 */
	public BarcoMercante(String inMatricula, double inMetrosEslora, int inNumTripulantes, int inNumPasajeros, int inEdad, double inCarga) {
		this.matricula = inMatricula;
		this.metrosEslora = inMetrosEslora;
		this.numTripulantes = inNumTripulantes;
		this.numPasajeros = inNumPasajeros;
		this.edad = inEdad;
		this.carga = inCarga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
		
	public double getTiempoDeVida() {
		return tiempoDeVida;
	}

	public void setTiempoDeVida(double tiempoDeVida) {
		this.tiempoDeVida = tiempoDeVida;
	}

	public double getValorEconomico() {
		return valorEconomico;
	}

	public void setValorEconomico(double valorEconomico) {
		this.valorEconomico = valorEconomico;
	}

	public double getValorEconomico10Anios() {
		return valorEconomico10Anios;
	}

	/**
	 * Metodo que calcula el tiempo de vida de un barco segun, la carga y el numero de tripulantes
	 */
	public double calcularTiempoVida() {
		tiempoDeVida = getCarga() * getNumTripulantes();
		return tiempoDeVida;
	}
	/**
	 * Metodo que calcula el valor economico de un barco, segun los metros de eslora y la carga
	 */
	@Override
	public double calcularValorEconomico() {
		valorEconomico = (getMetrosEslora() * MULTI_VALOR_ECONOMICO) * getCarga();
		return valorEconomico;
	}
	/**
	 *  Metodo que calcula el valor economico que tendra el barco en 10 años, segun el valor economico multiplicado por  la raíz cuadrada del número de años que tendrá dentro de 10 años.
	 */
	@Override
	public double calcularValorEn10Anios() {
		double anios = getTiempoDeVida() + SUMA_ANIOS_10;
		double raizCuadrada = Math.sqrt(anios);
		valorEconomico10Anios = ((getValorEconomico() / DIVIDIR_VALOR_ECONOMICO_10) * raizCuadrada);
		
		return valorEconomico10Anios;
	}
	
	/**
	 * Metodo que muestra la informacion de un barco mercante
	 */
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("******************************");
		System.out.println("Informacion Barco Mercante");
		System.out.println("Carga: "+carga+" kg"+"\n"+"Ratio de pasajeros: "+ratioPasajeros+"\n"+"Tiempo de vida: "+tiempoDeVida+"\n"+"Valor economico: "+valorEconomico+"\n"+"Valor economico dentro de 10 años: "+valorEconomico10Anios);
	}
}
