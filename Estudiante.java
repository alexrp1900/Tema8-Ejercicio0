package Ejer1;


public class Estudiante extends Persona {

	private int NumeroExpediente;
	private String CursoActual;
	private double[] notas;

	public Estudiante(String nombre, int edad,String coche, int NumeroExpediente, String CursoActual, double[] notas) {
		super(nombre, edad);

		this.NumeroExpediente = NumeroExpediente;
		this.CursoActual = CursoActual;
		this.notas = notas;

	
	}

	public int getNumeroExpediente() {
		return NumeroExpediente;
	}

	public void setNumeroExpediente(int numeroExpediente) {
		NumeroExpediente = numeroExpediente;
	}

	public String getCursoActual() {
		return CursoActual;
	}

	public void setCursoActual(String cursoActual) {
		CursoActual = cursoActual;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getNotaMedia() {
		int i=0;
		double media = 0;
		for (i = 0; i < notas.length; i++) {
			 media=media+notas[i];
		}
		media=media/i;

		return media;

	}

}
