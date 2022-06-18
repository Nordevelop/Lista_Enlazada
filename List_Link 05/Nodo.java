package misClases;

public class Nodo {
	/*Clase Nodo()
	 * 
	 */
	private String dato;
    Nodo siguiente;
    Nodo anterior;
    public Nodo() { // metodo #1 Constructor
    String dato;
    anterior = siguiente = null;
    }
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
}
