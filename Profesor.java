package Ejer1;

public class Profesor extends Persona {

	private String despacho;
	private String horasTutoria;

	public Profesor(String nombre, int edad, String coche, String despacho, String horasTutoria) {
		super(nombre, edad);

		this.despacho = despacho;
		this.horasTutoria = horasTutoria;

	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorasTutoria() {
		return horasTutoria;
	}

	public void setHorasTutoria(String horasTutoria) {
		this.horasTutoria = horasTutoria;
	}

	public String getConsultas() {

		String resultado=this.horasTutoria;
		
		
		return resultado;
	}

}
