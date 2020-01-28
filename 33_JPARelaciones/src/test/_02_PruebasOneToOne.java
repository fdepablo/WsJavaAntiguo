package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Cliente;
import modelo.entidad.DatosBancarios;
import modelo.entidad.Direccion;

public class _02_PruebasOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("PruebaJPARelaciones");
			
		EntityManager em = null;

		DatosBancarios db = new DatosBancarios(null, "Bankia", 6000, null);
		Cliente c = new Cliente(null, "Hommer", "555", db);
		//Si la relaci�n es bidireccional debemos cruzar las referencias:
		db.setCliente(c);
				
		System.out.println("==============================================");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//Podemos guardarlos individualmente y en orden
		//o si no existieran los cascades
		//em.persist(c);  //Aqui el cliente no tiene ID 
		//em.persist(db); //Aqui si
		
		//Como hemos definido la relaci�n en las dos clases podriamos, insertando
		//solo un objeto, insertar los dos
		
		em.persist(c); //-> se insertan los DB por el cascade que hay en Cliente
		//este falla ya que no hay cascade en la clase DatosBancarios
		//em.persist(db); //-> se inserta el cliente por el cascade de DatosBancarios
		
		//em.getTransaction().commit(); 
		//em.close();		
		
		
		//si queremos dar primero un cliente y luego unos datos bancarios
		//primero dariamos de alta el cliente y luego le buscariamos
		//y se lo asociariamos esos datos bancarios
		/*
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		DatosBancarios db2 = new DatosBancarios(null, "Bankia", 6000, null);
		Cliente c1 = em.find(Cliente.class, 5);
		db2.setCliente(c1);
		
		em.persist(db2);
		
		em.getTransaction().commit(); 
		em.close();
		*/
		
		emf.close();		
		
	}
	
	
}
