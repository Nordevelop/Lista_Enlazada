package misClases;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*Lista enlazada dato string
		 * 
		 * Author Nordevelop
		 */
		 Scanner entra=new Scanner(System.in);
			
		    System.out.println( "FRASE DE NIKLAUS WIRTH ");
			Lista objetoLista = new Lista();
	        System.out.println("Ingrese 16 mensajes a mostrar: ");
	        for (int i=0;i<17;i++)
	            objetoLista.agregarDato();
	        objetoLista.VisualizarDatos();    
	       
	}
}
