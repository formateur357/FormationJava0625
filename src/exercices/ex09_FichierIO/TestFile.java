package exercices.ex09_FichierIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) {
		
		// exo 1
		
		Path in = Path.of("input.txt");
		
		try (BufferedReader br = Files.newBufferedReader(in)) {
//			br.mark(4096);
			String ligne;
			while((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
//			br.reset();
//			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// exo 2
		
		Path out = Path.of("output.txt");
		
		try(BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(in));
				BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(out))) {
			
			byte[] buf = new byte[4096];
			int n;
			while ((n = bis.read(buf)) != -1) {
				bos.write(buf, 0, n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Version en une seule ligne
//		try {
//			Files.copy(Path.of("input.txt"), Path.of("output.txt"), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// exo 3
		
		Path cible = Path.of("saisie.txt");
		boolean fin = true;
		
		try (Scanner clavier = new Scanner(System.in);
				PrintWriter pw = new PrintWriter(Files.newBufferedWriter(cible))) {
			System.out.println("Tapez votre texte (ligne vide pour finir) :");
			
			while (fin) {
				String ligne = clavier.nextLine();
				
				if (ligne.isEmpty()) { fin = false; };
				pw.println(ligne);
			}
			System.out.println("Texte sauvegarde dans " + cible.toAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
