package _05_ficheros_objetos;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraVariosObjetos {

	public static void main(String[] args) {
		// Abrimos fichero para escritura
		FileOutputStream file;
		ObjectOutputStream buffer;
		try {
			file = new FileOutputStream("agenda.dat", true);//cuando abrimos un archivo en modo true
											//se abre en modo append, es decir no se borrar o se sobreescribe
			buffer = new ObjectOutputStream(file);
		} catch (IOException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}	
		
		// Creamos tres contactos
		Contacto c1 = new Contacto("Amelia", "913670542");
		Contacto c2 = new Contacto("Federico", "6166644422");
		Contacto c3 = new Contacto("Carmen", "639888777");
		
		// Guardamos los tres contactos en agenda.dat
		try {
			buffer.writeObject(c1);
			buffer.writeObject(c2);
			buffer.writeObject(c3);
			System.out.println("Los contactos se han guardado con éxito");
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero");
			System.out.println(e.getMessage());
		}
		
		// Cerrar el fichero
		try {
			buffer.close();
			file.close();
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
	}

}