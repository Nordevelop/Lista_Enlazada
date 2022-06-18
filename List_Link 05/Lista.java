package misClases;
import java.util.*;

public class Lista {
	Scanner entra=new Scanner(System.in);
    /*Author Nordevelop
	* Clase donde se dezplaza la  Doble Lista Enlazada
	*/
    String mensaje;
    Nodo comienzo;
	public Lista() { //constructor
		comienzo =null;
	}
    /*
    *Metodo #5s
    */
    public void agregarDato(){ //agregar datos a la lista
				
	System.out.println("ingrese un mensaje : ");
	    mensaje = entra.next();
	Nodo NuevoNodo;
	NuevoNodo = new Nodo();
	NuevoNodo.setDato(mensaje);
	NuevoNodo.siguiente =comienzo;
	if (comienzo != null)
	   comienzo.anterior = NuevoNodo;
	comienzo = NuevoNodo;
	}
    public void EliminarDato(){ //quitar datos de la lista
		
		Nodo NodoActual;
		Nodo NodoAnterior;
		NodoActual = comienzo;
		NodoAnterior = null;
		while (NodoActual != null){
		    NodoAnterior = NodoActual;
		    NodoActual = NodoActual.siguiente;
		}//fin while
		if (NodoActual != null ){
		   if (comienzo == NodoActual){
			comienzo = NodoActual.siguiente;
			NodoActual.siguiente = null;
	   }
	   else if(NodoActual.siguiente == null){
	    	 NodoAnterior.siguiente = null;
	   }
	  else{
		   NodoAnterior.siguiente = NodoActual.siguiente;
		   NodoAnterior.siguiente.anterior = NodoActual.anterior;
    	 }
	     }//fin if
		
	}//fin metodo #2 Eliminar
    public void VisualizarDatos(){
	Nodo Nodo;
	for(Nodo = comienzo;Nodo != null;Nodo = Nodo.siguiente)
	   System.out.print(" " + Nodo.getDato() +" ");
    }//fin metodo #3 visualizar


}
