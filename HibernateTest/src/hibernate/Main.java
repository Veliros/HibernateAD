package hibernate;
import java.util.Date;

import org.hibernate.Session;
/**
 * Clase principal:
 * 
 * @author marta
 */
public class Main {

	/**
	 * Método principal:
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtilities.getSessionFactory().openSession();	
		
		// INSERTAR EN BD: 
	    session.beginTransaction();
		
		Empresa e = new Empresa();
		Item i = new Item();
		Pedido p = new Pedido();
		
		// EMPRESA:
		e.setDireccion("aaaaaa");
		e.setEmpleados(20);
		// Dato a cambiar tras 1 inserción:
		e.setNombre("test234");
		
		// ITEM:
		i.setNombre("item234");
		i.setCantidad(40);
		
		// PEDIDO:
		p.setFecha(new Date());
		
		// Guardar datos:
		session.save(e);
		session.save(i);
		session.save(p);
		
		session.getTransaction().commit();	
		
		// Recoge datos de la bd:
		session.beginTransaction();
		
		// Cambiar número para recoger distintos resultados:
		Empresa e1 = session.get(Empresa.class, 1);
		System.out.println("Empresa " + e1.getNombre() + e1.getDireccion() + " " + 
		e1.getEmpleados());
		
		Item i1 = session.get(Item.class, 1);
		System.out.println("\nItem: " + i1.getNombre() + i1.getCantidad());
		
		Pedido p1 = session.get(Pedido.class, 1);
		System.out.println("\nPedido: " + p1.getFecha().toString());
		
		session.getTransaction().commit();
		session.close();	
		HibernateUtilities.getSessionFactory().close();
	}

}
