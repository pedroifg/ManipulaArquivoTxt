import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Projeto {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner (System.in);
				
		File arquivo = new File ("C:\\Users\\pedro\\OneDrive\\PEDRO IVO\\Documentos\\Pedro Ivo\\SPI\\Projetos\\ManipulaTxt\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		System.out.println("---- Opções: ----");
		System.out.println("---- 1 - Digite o conteúdo do documento: ----");
		System.out.println("---- 2 - Ver conteúdo do documento ----");
		System.out.println("---- 3 - Deletar documento ----");
		
		int escolha = sc.nextInt();
		
		switch (escolha) {
		
		case 1: 
			Scanner sc2 = new Scanner (System.in);
			FileWriter writeFile = new FileWriter(arquivo);
			BufferedWriter buffer = new BufferedWriter (writeFile);
			System.out.println("Digitar o conteúdo do documento: ");
			for (int i=0; i<1; i++) {
				String linha = sc2.nextLine();
				buffer.write(linha);
			}
			buffer.close();			
			break;
			
		case 2: 
			FileReader readFile = new FileReader(arquivo);
			BufferedReader bufferRead = new BufferedReader(readFile);
			System.out.println("O conteúdo do documento é :");
			String mostrar;
			while(bufferRead.ready()) {
				mostrar = bufferRead.readLine();
				System.out.println(mostrar);
			}
			bufferRead.close();
			break;
			
		case 3:
			arquivo.delete();				
			System.out.println("O arquivo foi deletado");
			break;
			
		default: 
			System.out.println("Opção inválida, escolha dentre estas opções: ");
			menu();
		}		
		sc.close();
		
	}
	
	public static void menu() {
		System.out.println("---- Opções: ----");
		System.out.println("---- 1 - Digite o conteúdo do documento: ----");
		System.out.println("---- 2 - Ver conteúdo do documento ----");
		System.out.println("---- 3 - Deletar documento ----");
	}
}
