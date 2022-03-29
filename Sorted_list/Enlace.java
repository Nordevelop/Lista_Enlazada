package misClases;

public class Enlace {
	
		public long Data1; // data item
		public Enlace siguiente; // next link in list
		// -------------------------------------------------------------
		public Enlace(long d1) // constructor
		{ Data1 = d1; }
		// -------------------------------------------------------------
		public void mostrarenlace() // display this link
		{ System.out.print(Data1 + " "); }
	

}// end class Link
