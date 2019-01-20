package hibernate;
import java.io.Serializable;

/**
 * Item
 * 
 * @author marta
 */
public class Item implements Serializable {
	static final long serialVersionUID = 2L;
	private String nombre;
	private int cantidad, id;
	
	/**
	 *  Constructor:
	 *  
	 * @param id
	 * @param nombre
	 * @param cantidad
	 */
	/*public Item(int id, String nombre, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
