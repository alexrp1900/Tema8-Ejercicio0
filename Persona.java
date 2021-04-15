package Ejer1;


public class Persona {
	private int edad;
	private String nombre;
	private Coche coche;

	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.coche = null;
		this.nombre = nombre;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	public int getEdad() {

		return edad;
	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

}
