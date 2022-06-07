package misClases;
import java.util.*;

public class SortedLista {
	private Enlace primero; // ref al primer item  en la lista

	public SortedLista() // constructor
	{ primero = null; }
	
	public boolean isEmpty(){ // verdadero si enlace == empty
	 return (primero==null); 
	 }
	// -------------------------------------------------------------
	public void agregar(long key){ //agregar en orden
	
	Enlace newLink = new Enlace(key); // 
	Enlace previous = null; 
	Enlace current = primero; 
	while(current != null && key > current.Data1){ // campo clave > nodo_actual key > current,
	previous = current;
	current = current.siguiente; // ir al siguiente elemento
	}
	if(previous==null) 
		primero = newLink;
	else 
	previous.siguiente = newLink; 
	newLink.siguiente = current; 
	} // fin agregar()
	
	public Enlace borrar(){ //retorna variable temporal y borra enlace del primer punntero
	 // (presume que la lista no esta vacia lista)
	Enlace temp = primero; // guardar primero
	primero = primero.siguiente; // borrar primero
	return temp; // return value
	}
	
	public void mostrarLista(){
		System.out.print("Lista Ordenada (primero-->ultimo): ");
		Enlace current = primero; // start at beginning of list
		while(current != null){ 
			current.mostrarenlace(); 
			current = current.siguiente; 
	}
	System.out.println(" ");
	}
	} // end class SortedList
	
	
	


