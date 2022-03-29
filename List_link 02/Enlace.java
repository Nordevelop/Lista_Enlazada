package misClases;

import java.util.*;

public class Enlace {
	public long dData;	 // data item
	public Enlace next;	 // next link in list
	public Enlace(long d)	 // constructor
	{ dData = d; }
	
	public void mostrar_enlace()
	 // display this link
	{ System.out.print(dData + " "); }

}
