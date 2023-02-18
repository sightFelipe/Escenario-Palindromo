package mundo;

import java.util.Scanner;

/**
 * Esta clase proporciona una interfaz de usuario para determinar si una palabra es un palíndromo.
 */
public class aplicacion {
    
    /**
     * Este método es el punto de entrada de la aplicación.
     * 
     * @param args los argumentos de línea de comandos (no se utilizan en esta aplicación)
     */
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese una palabra: ");
	    String palabra = scanner.nextLine();

	    boolean esPalindromo = Palindromo.esPalindromo(palabra);

	    System.out.println(esPalindromo);
	    
	}
	
}
	