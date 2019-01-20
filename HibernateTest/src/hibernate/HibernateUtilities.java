package hibernate;
import org.hibernate.HibernateException;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * 
 * @author marta
 *
 */
public class HibernateUtilities {
private static org.hibernate.SessionFactory sessionFactory = buildSessionFactory();
	
	/**
	 * 
	 * @return sessionFactory
	 */
	private static org.hibernate.SessionFactory buildSessionFactory(){
		try{		
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			return (org.hibernate.SessionFactory) metadata.getSessionFactoryBuilder().build();
			
		}catch(HibernateException e){
			System.out.println("Problema creando SessionFactory " + e);
		}
		
		return sessionFactory;
	}
	
	/**
	 * 
	 * @return sessionFactory
	 */
	public static org.hibernate.SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
