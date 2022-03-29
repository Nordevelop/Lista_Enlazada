package misClases;

public class Link {
	/*@Author Nordevelop
	 * 
	 */
	private int id, dd;                 // objetos emcapsulados.Con Acceso Denegado en la clase Main{}
	public int iData;                          // elemento del Dato Clave de la lista enlazada
	public double dData;                      // elemento Entero de la lista
	public Link next;                         // ---> enlace de la lista 
	// -------------------------------------------------------------
	public Link(int id, double dd)            // constructor
	{
	iData = id;                            
	dData = dd;                           
	}                                     
	
	public void displayLink()            
	{
	System.out.print("{" + iData + ", " + dData + "}");
	}
} //Fin Clase Link()
