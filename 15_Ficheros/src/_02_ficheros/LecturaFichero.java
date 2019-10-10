
package _02_ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		System.out.println("Vamos a leer nuestro fichero de texto + " + EscrituraFichero.NOMBRE_FICHERO);
		
		FileReader fr;
		BufferedReader br = null;

		try {
			fr = new FileReader(EscrituraFichero.NOMBRE_FICHERO);
			br = new BufferedReader(fr);
			String s = br.readLine();
			while(s != null){
				System.out.println("Frase del fichero: " +s);
				s = br.readLine();
			}
			System.out.println("Fichero leido correctamente");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Leemos con try with resource");
		//Try with resource y nos evitamos el close()
		try(FileReader fr2 = new FileReader(EscrituraFichero.NOMBRE_FICHERO);
				BufferedReader br2 = new BufferedReader(fr2)){
			String s = br2.readLine();
			while(s != null){
				System.out.println("Frase del fichero: " +s);
				s = br2.readLine();
			}
			System.out.println("Fichero leido correctamente");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Programa finalizado");
	}

}
