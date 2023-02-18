package mundo;

public class Palindromo {
	
	  /**
   * Metodo que determina si una palabra es un palíndromo o no.
   * 
   * @param palabra la palabra a evaluar
   * @return true si la palabra es un palíndromo, false de lo contrario
   */
  public static boolean esPalindromo(String palabra) {
      // Convertir la palabra a minúsculas y quitar espacios en blanco 
	  palabra = palabra.toLowerCase().replaceAll("[^a-z0-9]", "");  //utilizamos la expresión regular [a-z0-9], que busca cualquier carácter que no sea una letra minúscula o un dígito. 

      // Verificar si la palabra es igual a su reverso
      return palabra.equals(new StringBuilder(palabra).reverse().toString()); // Comparamos y revisamos la palabra y su inverso para ver si es un palindromo o no 
  }
}