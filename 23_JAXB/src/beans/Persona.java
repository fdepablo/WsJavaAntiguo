package beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

//Estas anotaciones sirven para que JAXB que es el motor de java para
//convertir objetos a XML y a la inversa, sepa como hacerlo

//esta etiqueta estamos estableciendo el nombre de el nodo raiz en xml
@XmlRootElement(name="persona")
//podemos hacer que las etiquetas salgan en un determinado orden
@XmlType(propOrder = {
	    "idPersona",
	    "nombre",
	    "apellido",
	    "edad"
	})
public class Persona {
	private int idPersona;
	private String nombre;
	private String apellido;
	private int edad;
	private Direccion direccion;
	
	public Persona() {
		
	}
	
	public Persona(int id, String nombre, String apellido, int edad) {
		this.idPersona = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@XmlAttribute
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@XmlElement
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name="apellido")
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@XmlElement
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", direccion=" + direccion + "]";
	}
	
	
}
