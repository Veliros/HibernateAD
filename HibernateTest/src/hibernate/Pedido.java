package hibernate;
import java.io.Serializable;
import java.util.Date;
/**
 * Pedido
 * 
 * @author marta
 */
public class Pedido implements Serializable {
	static final long serialVersionUID = 3L;
	private int id;
	private Date fecha;
	
	/**
	 * 
	 * @param id
	 * @param fecha
	 */
	/*public Pedido(int id, Date fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}*/

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
}
