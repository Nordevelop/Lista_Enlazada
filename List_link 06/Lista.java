package misclases;
import java.util.*;

public class Lista {
	Scanner entra=new Scanner(System.in);
    /*Author Nordevelop
	* Clase donde se dezplaza la  Doble Lista Enlazada
	*/
    String nombre;
    String apellido;
    int legajo=0;
    Nodo comienzo;
	public Lista() { //constructor
		comienzo =null;
	}
    /*
    *Metodos
    */
    public void agregarDato(){ //agregar nombres a la lista
				
	System.out.println("ingrese Nombre del alumno : ");
	   nombre = entra.next();
	System.out.println("ingrese Apellido del alumno: ");   
	   apellido = entra.next();
	System.out.println("Ingrese Legajo del Alumno: ");   
	   legajo = entra.nextInt();
	Nodo NuevoNodo;
	NuevoNodo = new Nodo();
	NuevoNodo.setnombre(nombre);
	NuevoNodo.setapellido(apellido);
	NuevoNodo.setlegajo(legajo);
	NuevoNodo.siguiente =comienzo;
	if (comienzo != null)
	   comienzo.anterior = NuevoNodo;
	comienzo = NuevoNodo;
	}
    public void EliminarDato(){ //quitar nombres de la lista
		
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
		
	}//fin metodo  Eliminar
    public void VisualizarDatos(){
	Nodo Nodo;
	for(Nodo = comienzo;Nodo != null;Nodo = Nodo.siguiente) {
       System.out.print(" " + Nodo.getnombre() +" ");
       System.out.print(" " + Nodo.getapellido()+" ");
       System.out.print(" " + Nodo.getlegajo()+ " "+",");
	}
	   
    }//fin metodo visualizar


}
