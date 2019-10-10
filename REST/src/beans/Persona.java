package beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="persona")
public class Persona implements Serializable{
	
private static final long serialVersionUID = 3575918590687798833L;
	
	private int idPersona;
	private String nombre;
	private String apellido;
	private int edad;
	
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

	@XmlElement
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

}
