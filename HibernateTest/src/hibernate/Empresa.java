package hibernate;
import java.io.Serializable;

/**
 * Empresa
 * 
 * @author marta
 */
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	private int empleados;
	private String direccion, nombre;
	private int id;
	
	/**
	 * Constructor:
	 * 
	 * @param empleados
	 * @param direccion
	 * @param id
	 */
	/*public Empresa(int empleados, String direccion, int id) {
		super();
		this.empleados = empleados;
		this.direccion = direccion;
		this.id = id;
	}*/

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

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
	
	
}
