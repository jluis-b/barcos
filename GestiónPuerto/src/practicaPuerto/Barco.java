package practicaPuerto;


public abstract class Barco implements Comparable, Valorable{
	protected String matricula;
	protected double metrosEslora;
	protected int numTripulantes;
	protected int numPasajeros;
	protected int edad;
	protected double ratioPasajeros;
	
	/**
	 * Constante que indica que un objeto es MAYOR que otro.
	 */
	public final static int MAYOR = 1;
	
	/**
	 * Constante que indica que un objeto es MENOR que otro.
	 */
	public final static int MENOR = 1;
	
	/**
	 * Constante que indica que dos objetos son IGUALES.
	 */
	public final static int IGUAL = 1;
	
	/**
	 * Constructor sin parametros
	 */
	public Barco() {
		matricula = "---";
		metrosEslora = 0;
		numTripulantes = 0;
		numPasajeros = 0;
		edad = 0;
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
	public Barco(String inMatricula, double inMetrosEslora, int inNumTripulantes, int inNumPasajeros, int inEdad) {
		this.matricula = inMatricula;
		this.metrosEslora = inMetrosEslora;
		this.numTripulantes = inNumTripulantes;
		this.numPasajeros = inNumPasajeros;
		this.edad = inEdad;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getMetrosEslora() {
		return metrosEslora;
	}

	public void setMetrosEslora(double metrosEslora) {
		this.metrosEslora = metrosEslora;
	}

	public int getNumTripulantes() {
		return numTripulantes;
	}

	public void setNumTripulantes(int numTripulantes) {
		this.numTripulantes = numTripulantes;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo que indica si un barco es mayor segun el numero de tripulantes
	 */
	@Override
	public int esMayorQue(Comparable param) {
		int estado = MAYOR;

		if(numTripulantes < getNumTripulantes()) {
			estado = MENOR;
		}else if(numTripulantes == getNumTripulantes()) {
			estado = IGUAL;
		}
		return estado;
	}

	/**
	 * Metodo que indica si un barco es menor segun el numero de tripulantes
	 */
	@Override
	public int esMenorQue(Comparable param) {
		int estado = MENOR;

		if(numTripulantes > getNumTripulantes()) {
			estado = MAYOR;
		}else if(numTripulantes == getNumTripulantes()) {
			estado = IGUAL;
		}
		return estado;
	}

	/**
	 * Metodo que indica si dos barcos son iguales segun el numero de tripulantes
	 */
	@Override
	public int esIgualQue(Comparable param) {
		int estado = IGUAL;

		if(numTripulantes > getNumTripulantes()) {
			estado = MAYOR;
		}else if(numTripulantes < getNumTripulantes()) {
			estado = MENOR;
		}
		return estado;
	}
	
	/**
	 *  Metodo que calcula el ratio de un barco segun el numero de pasajeros y el numero de tripulantes
	 * @return devuelve el ratio de pasajeros por barco
	 */
	public double calcularRatio() {
		ratioPasajeros = getNumPasajeros() / getNumTripulantes();
		return ratioPasajeros;

	}
	
	/**
	 *  Metodo abstracto que calcula el tiempo de vida de cada barco
	 * @return
	 */
	public abstract double calcularTiempoVida();
	
	/**
	 * Metodo que muestra la informacion de un barco
	 */
	public void mostrarInfo() {
		System.out.println("******************************");
		System.out.println("Informacion Barco.");
		System.out.println("Matricula: "+matricula+"\n"+"Metros de eslora: "+metrosEslora+"\n"+"Numero de tripulantes: "+numTripulantes+"\n"+"Numero de pasajeros: "+numPasajeros);
	}
	
} 