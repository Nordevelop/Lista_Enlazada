package misClases;

public class Listlink {
	/*@Author Nordevelop
	 * ListLink.java
	 */
	private Link first;                  // ref. al primer enlace de la lista
	                                /*
	                                 * objeto emcapsulado.Con Acceso Denegado en la clase Main{}
	                                 */
	// -------------------------------------------------------------//
	public Listlink()                   // clase constructor 
	{
	first = null;                      // sin elementos en la Lista 
	}
	
	public boolean isEmpty()           // Verdadero si la lista esta vacia
	{
	return (first==null);
	}
	
	public void insertFirst(int id, double dd)             // inserción al inicio de la lista enlazada
	{
	
	Link newLink = new Link(id, dd);  // Crea un nuevo enlace
	newLink.next = first;                // nuevo enlace
	
	first = newLink;                    // primero --> nuevo enlace
	}
	
	public Link deleteFirst(){           // Borra el primer elemento
	Link temp = first;                 // guarda referencia al primer elemento
	first = first.next;                // Borra desde el primer elemento hasta el ultimo 
	return temp;                       // Devuleve el enlace borrado
	}
	public void displayList(){
		
	System.out.print("Lista (Primero-->Ultimo): ");
	Link current = first;           // inicia al comienzo de la lista.
	while(current != null){          // hasta el final de la lista
	
	current.displayLink();         // muestra el enlace
	current = current.next; // mueve al siguiente enlace de la lista
	}
	System.out.println("");
	}
	
	} // fin clase LinkList 