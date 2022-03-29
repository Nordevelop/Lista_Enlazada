package misClases;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner entra=new Scanner(System.in);
		/*Author Nordevelop
		* Clase donde se dezplaza la lista enlazada simple
		*/
		Lista objLista = new Lista();
		System.out.println("Ingrese 10 Nros enteros");
		for(int i=0;i<10;i++) {			
			objLista.InsertarDato();
		}
		System.out.println("Lista Original:");
		objLista.VisualizarDatos();
		System.out.println("\n Lista sin los Nros Negativos");
		for(int i=0;i<10;i++){
			objLista.EliminarDato();
		}
		objLista.VisualizarDatos();
		
		
		
		

	}

}
