package misClases;

public class Main {

	public static void main(String[] args) {
		/*author Nordevelop
		 * 
		 */
		
		Listlink theList = new Listlink(); // declararacion lista enlazada 
		theList.insertFirst(36,6);           // ingrese n elementos dentro de la lista
		theList.insertFirst(25,5);  //potencias
		theList.insertFirst(49,7);
		theList.insertFirst(64,8);
		theList.insertFirst(81,9);
		theList.insertFirst(100, 10);
		theList.insertFirst(144, 12);
		theList.displayList();         //Muestra en pantalla la lista enlazada
		
		while( !theList.isEmpty() )             //Mientras La lista enlazada este vacia(null)
		
		{
		Link aLink = theList.deleteFirst();     // Borrado de la lista enlazada
		 
		System.out.print("Borrado ");
		
		aLink.displayLink();                     
		System.out.println("");
		}
		theList.displayList();            // //muestra en pantalla el borrado
	}

}
