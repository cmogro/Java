import java.util.Scanner;
public class TrabajoConCadenas {

	public static void main(String[] args) {
		String texto = IngesarTexto();
		ProcesarTexto(texto);

	}
	
	public static String IngesarTexto() {
		String texto;
		
		while(true) {
			
			try (Scanner consola = new Scanner(System.in)){
				System.out.println("Ingrese una cadena de texto: ");
				texto = consola.nextLine();
				break;
			}catch(Exception e) {
				System.out.println("Error, debe ingresar una cadena");
			}
			
			}
		
		return texto;
	}
	
	public static String ProcesarTexto(String texto) {
		
		System.out.println(texto.toUpperCase());	
		System.out.println(texto.toLowerCase());
		
		int letram = 0;
		int letraM = 0;
		int longitud = texto.length();
		
		for(int i=0 ;i < longitud ; i++ ) {
			
			char letra = texto.charAt(i);
			if(Character.isUpperCase(letra)){
				letraM = letraM + 1;
			}else if(Character.isLowerCase(letra)){
				letram = letram + 1;
			}
		}
		System.out.println("Numero de letras mayusculas: "+letraM);
		System.out.println("Numero de letras minusculas: "+letram);
		
		return null;
	}
	

}

