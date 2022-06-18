package misclases;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*Lista enlazada dato string
		 * 
		 * Author Nordevelop
		 */
		 Scanner entra=new Scanner(System.in);
			
		    System.out.println( "Nombre, Apellido y legajo de los Alumnos ");
			Lista objetoLista = new Lista();
	        System.out.println("Ingrese listado de  alumnos a Inscripción de Final ");
	        for (int i=0;i<3;i++)
	            objetoLista.agregarDato();
	        System.out.print("Listado de alumnos: ");
	        objetoLista.VisualizarDatos();    
	       

	}

}
