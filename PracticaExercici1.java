package UF1;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticaExercici1 {

	public static void main(String[] args) throws IOException {

		File arxiu1 = new File(args[0]);
		arxiu1.createNewFile();
		File arxiu2 = new File(args[1]);
		arxiu2.createNewFile();

		FileReader arx1 = new FileReader(arxiu1);
		FileReader arx2 = new FileReader(arxiu2);

		BufferedReader buff1 = new BufferedReader(arx1);
		BufferedReader buff2 = new BufferedReader(arx2);

		String axiu1 = new String();
		String axiu2 = new String();

		axiu1 = buff1.readLine();
		axiu2 = buff2.readLine();

		if (axiu1.equals(axiu2)) {

			System.out.println("Els arxius son iguals!");

		} else {

			System.out.println("Els arxius no son iguals!");

		}

		buff1.close();
		buff2.close();
	}
}
