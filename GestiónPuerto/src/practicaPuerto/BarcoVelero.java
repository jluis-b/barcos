package practicaPuerto;

public class BarcoVelero extends Barco{
	private double numCamarotes;
	private double precioAlquiler;
	private double tiempoDeVida;
	private double valorEconomico;
	private double valorEconomico10Anios;
	private double MULTI_VALOR_ECONOMICO = 5500;
	private double DIVIDIR_VALOR_ECONOMICO_10 = 0.3;

	/**
	 * Constructor sin parametros
	 */
	public BarcoVelero() {
		numCamarotes = 0;
		precioAlquiler = 0;
	}
	
	/**
	 * Constructor con 7 parametros
	 * @param inMatricula del barco
	 * @param inMetrosEslora del barco
	 * @param inNumTripulantes del barco
	 * @param inNumPasajeros del barco
	 * @param inEdad del barco
	 * @param inNumCamarotes del barco
	 * @param inPrecioAlquiler del barco
	 */
	public BarcoVelero(String inMatricula, double inMetrosEslora, int inNumTripulantes, int inNumPasajeros, int inEdad, double inNumCamarotes, double inPrecioAlquiler) {
		this.matricula = inMatricula;
		this.metrosEslora = inMetrosEslora;
		this.numTripulantes = inNumTripulantes;
		this.numPasajeros = inNumPasajeros;
		this.edad = inEdad;
		this.numCamarotes = inNumCamarotes;
		this.precioAlquiler = inPrecioAlquiler;
	}

	public double getNumCamarotes() {
		return numCamarotes;
	}

	public void setNumCamarotes(double numCamarotes) {
		this.numCamarotes = numCamarotes;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	public double getTiempoDeVida() {
		return tiempoDeVida;
	}

	public double getValorEconomico10Anios() {
		return valorEconomico10Anios;
	}

	public double getMULTI_VALOR_ECONOMICO() {
		return MULTI_VALOR_ECONOMICO;
	}

	public double getDIVIDIR_VALOR_ECONOMICO_10() {
		return DIVIDIR_VALOR_ECONOMICO_10;
	}

	public double getValorEconomico() {
		return valorEconomico;
	}
	
	/**
	 * Metodo que calcula el tiempo de vida de un barco segun, el numero de pasajeros y los metros de eslora
	 */
	public double calcularTiempoVida() {
		tiempoDeVida = getNumPasajeros() * getMetrosEslora();
		return tiempoDeVida;
	}
		
	/**
	 * Metodo que calcula el valor economico de un barco, segun los metros de eslora y el numero de camarotes
	 */
	@Override
	public double calcularValorEconomico() {
		valorEconomico = (getMetrosEslora() * MULTI_VALOR_ECONOMICO) * getNumTripulantes();
		return valorEconomico;
	}

	/**
	 * Metodo que calcula el valor economico que tendra el barco en 10 años, segun el valor economico, numero camarotes y el pretio del alquiler
	 */
	@Override
	public double calcularValorEn10Anios() {
		double log = Math.log(getPrecioAlquiler());
		valorEconomico10Anios = (((getValorEconomico() / DIVIDIR_VALOR_ECONOMICO_10) * getNumCamarotes()) * log);
		return valorEconomico10Anios;
	}
	
	/**
	 * Metodo que muestra la informacion de un barco velero
	 */
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("******************************");
		System.out.println("Informacion Barco Velero");
		System.out.println("Numero de camarotes: "+numCamarotes+"\n"+"Precio Alquiler/dia: "+precioAlquiler+"\n"+"Ratio de pasajeros: "+ratioPasajeros+"\n"+"Tiempo de vida: "+tiempoDeVida+"\n"+"Valor economico: "+valorEconomico+"\n"+"Valor economico dentro de 10 años: "+valorEconomico10Anios);
	}

	
}
