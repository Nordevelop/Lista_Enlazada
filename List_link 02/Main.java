package misClases;

public class Main {

	public static void main(String[] args) {
		/*Lista Doble enlazada
		 * Author Nordevelop
		 */
		PrimeroUltimoLista lista= new PrimeroUltimoLista();
		lista.ingreso_primero(13);
		lista.ingreso_primero(21);
		lista.ingreso_primero(34);
		lista.ingreso_ultimo(55);
		lista.ingreso_ultimo(89);
		lista.ingreso_ultimo(144);
		lista.borrar_primero();
		lista.mostrarLista();

	}

}
