package misclases;

public class Nodo {
	/*Clase Nodo()
	 * 
	 */
	private String nombre;
	private String apellido;
	private int legajo=0;
    Nodo siguiente;
    Nodo anterior;
    public Nodo() { // metodo #1 Constructor
    String nombre;
   String apellido;
   int legajo;
    anterior = siguiente = null;
    }
    public int getlegajo() {
    	return legajo;
    }
    public int setlegajo(int legajo) {
    	return this.legajo= legajo;
    }
    
	public String getnombre() {
		return nombre;
	}
	public String setnombre(String nombre) {
		return this.nombre = nombre;
	}
	public String getapellido() {
    	return apellido;
    }
	public String setapellido(String apellido) {
		return this.apellido= apellido;
	}

}
