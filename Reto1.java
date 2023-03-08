package retos2022;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author speedemon_Antonio Ruiz Benito
 *
 */
public class Reto1 {
	
	/*
	 * Reto #1: ¿ES UN ANAGRAMA?
	 * Escribe una función que reciba dos palabras (String) y retorne
	 * verdadero o falso (Bool) según sean o no anagramas.
	 * - Un Anagrama consiste en formar una palabra reordenando TODAS
	 *   las letras de otra palabra inicial.
	 * - NO hace falta comprobar que ambas palabras existan.
	 * - Dos palabras exactamente iguales no son anagrama.
	 */

	
	public static void main (String[] args) {
		
		comprobarAnagramas(null, null);
		
	}
	
	// Creo la funcion
	/**
	 * Esta funcion comprueba si 2 palabras son anagramas 
	 * @param palabra1 -> palabra introducida por el usuario
	 * @param palabra2 -> palabra introducida por el usuario
	 * @return devuelve true si es correcto y false si es falso
	 */
	public static boolean comprobarAnagramas (String palabra1, String palabra2) {
		
		// Utilizo la clase Scanner para interactuar con el usuario recogiendo sus valores introducidos
		Scanner sc = new Scanner(System.in);
		
		// Muestro por consola un mensaje al usuario para pedirle la primera palabra
		System.out.println("Introduce la primera palabra:");
		// Convierto todo a minusculas con toLowerCase() y eliminos espacios y signos de puntuacion con replaceAll()
		String palabra1Usuario = sc.nextLine().toLowerCase().replaceAll("[^a-z]", "");;
		
		// Muestro un mensaje al usuario para pedirle la segunda palabra
		System.out.println("Introduce la segunda palabra:");
		// Convierto todo a minusculas con toLowerCase() y eliminos espacios y signos de puntuacion con replaceAll()
		String palabra2Usuario = sc.nextLine().toLowerCase().replaceAll("[^a-z]", "");
		
		/* Convierto los caracteres a arreglos ordenados */
		
		// Convierto la palabra 1 en un array de caracteres
		char[] arrayPalabra1 = palabra1Usuario.toCharArray();
		// Ordeno alfabeticamente la palabra 1
		Arrays.sort(arrayPalabra1);
		
		// Convierto la palabra 2 en un array de caracteres
		char[] arrayPalabra2 = palabra2Usuario.toCharArray();
		// Ordeno alfabeticamente la palabra 2
		Arrays.sort(arrayPalabra2);
		
		// Comparo los arrays para saber si contienen las mismas letras y los almaceno en una variable
		boolean anagrama = Arrays.equals(arrayPalabra1, arrayPalabra2);
		
		// Comparo el valor de la variable anagrama y muestro un mensaje al usuario con el resultado
		if (anagrama== true) {
			System.out.println("Las palabras " + palabra1Usuario + " y " + palabra2Usuario + " son anagramas.");
		} else {
			System.out.println("Las palabras " + palabra1Usuario + " y " + palabra2Usuario + " no son anagramas.");
		}
		
	
		// Devuelvo el resultado
		return anagrama;
	}
	
	
}
