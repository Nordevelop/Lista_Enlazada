package misClases;

public class Enlace {
	
		public long Data1; // elemento dato
		public Enlace siguiente; // siguiente link en la lista

		public Enlace(long d1) // constructor
		{ Data1 = d1; }
		
		public void mostrarenlace() 
		{ System.out.print(Data1 + " "); }
	

}// end class enlace
