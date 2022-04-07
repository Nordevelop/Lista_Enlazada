package misClases;
import java.util.*;

public class SortedLista {
	private Enlace primero; // ref tal primer item  en la lista

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
	while(current != null && key > current.Data1){ // o key > current,
	previous = current;
	current = current.siguiente; // ir al siguiente elemento
	}
	if(previous==null) // al comenzar de la lista
		primero = newLink; // primero --> newLink
	else // not at beginning
	previous.siguiente = newLink; // old prev --> newLink
	newLink.siguiente = current; // newLink --> old current
	} // end insert()
	// -------------------------------------------------------------
	public Enlace borrar() // return & delete primero link
	{ // (assumes non-empty list)
	Enlace temp = primero; // save primero
	primero = primero.siguiente; // delete primero
	return temp; // return value
	}
	// -------------------------------------------------------------
	public void mostrarLista(){
		
		System.out.print("Lista Ordenada (primero-->ultimo): ");
		Enlace current = primero; // start at beginning of list
		while(current != null){ // until end of list,
			current.mostrarenlace(); // print data1
			current = current.siguiente; // move to next link
	}
	System.out.println(" ");
	}
	
		
	
	} // end class SortedList
	////////////////////////////////////////////////////////////////
	
	


