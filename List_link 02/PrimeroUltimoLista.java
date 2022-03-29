package misClases;

import java.util.*;


public class PrimeroUltimoLista {
	private Enlace primero;	// ref to primero link
	private Enlace ultimo;	// ref to ultimo link
	//-------------------------------------------------------------
	public PrimeroUltimoLista()	// clase constructor
	{
	primero = null;	// no links on list yet
	ultimo = null;
	}
	//-------------------------------------------------------------
	public boolean isEmpty()	// true if no links
	{ return primero==null; }
	//-------------------------------------------------------------
	public void ingreso_primero(long dd){ // insert at front of list
	
	Enlace newLink = new Enlace(dd);	// make new link
	if( isEmpty() )	// if empty list,
	ultimo = newLink;	// newLink <-- ultimo
	newLink.next = primero;	// newLink --> old primero
	primero = newLink;	// primero --> newLink
	}
	//-------------------------------------------------------------
	public void ingreso_ultimo(long dd)
	// insert at end of list
	{
	Enlace newLink = new Enlace(dd);	// make new link
	if( isEmpty() )	// if empty list,
	primero = newLink;	// primero --> newLink
	else
	ultimo.next = newLink;	// old ultimo --> newLink
	ultimo = newLink;	// newLink <-- ultimo
	}
	//-------------------------------------------------------------
	public long borrar_primero()
	// delete primero link
	{
	// (assumes non-empty list)
	long temp = primero.dData;
	if(primero.next == null)
	// if only one item
		ultimo = null;
	// null <-- ultimo
	primero = primero.next;
	// primero --> old next
	return temp;
	}
	//-------------------------------------------------------------
	public void mostrarLista()
	{
	System.out.print("List (primero-->ultimo): ");
	Enlace current = primero;
	// start at beginning
	while(current != null)
	// until end of list,
	{
	current.mostrar_enlace();
	// print data
	current = current.next;
	// move to next link
	}
	System.out.println("");
	}

}
