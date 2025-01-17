package Ejercicio02Anagrama;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */

        /*
        Desglose de tareas:
        -En una funcion:                                        (public static boolean..)
        -Pedir 2 strings                                        (system.in)
        -Guardarlos por separado                                (scanner)
        -reducir strings a minuscula y borrar espacios          (tolowercase & replace)
        -comprobar que no sean la misma palabra                 (equals)
        -para que sean anagrama, tienen que tener mismo numero de letras y cantidad de ellas
        -comparar string.length, si es igual, palante, si no, devolvemos FALSE (string.lenght())
        -Se pasan los strings a caracteres dentro de un ARRAY   (toCharArray)
        -Se ordenan los arrays alfabeticamente                  (arrays.sort)
        -Se compararan ambos arrays con ARRAYS.EQUALS que compara el contenido
        -Retorna bool                                           (true if anagrama) (false if not)

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame dos palabras cualesquiera. Este programa comprobará si son anagramas o no");
        String palabra1 = scanner.nextLine();;
        String palabra2 = scanner.nextLine();;



        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" son efectivamente anagramas.");
        } else {
            System.out.println("Las palabras introducidas NO son anagramas");
        }
        scanner.close();

        } // fin Main

    public static boolean sonAnagramas(String palabra1, String palabra2) {

        palabra1 = palabra1.toLowerCase(); // convierto ambos strings en minusculas, para evitar problemas (podria comprobarse tambien si son letras o no, etc)
        palabra2 = palabra2.toLowerCase();
        palabra1 = palabra1.replace(" ", ""); // recortamos espacios delante, detras e intermedios
        palabra2 = palabra2.replace(" ", "");
        // se podria hacer como palabra1 = palabra1.toLowerCase().replace(" ","");
        // se podria hacer como palabra2 = palabra2.toLowerCase().replace(" ","");

        char[] string1AChar = palabra1.toCharArray(); // he creado dos arrays, uno por palabra, para tener los strings en caracteres
        char[] string2AChar = palabra2.toCharArray();

        // System.out.println(string1AChar); // comprobacion de los arrays que deberian estar desordenados aun
        // System.out.println(string2AChar);

        Arrays.sort(string1AChar); // aqui ordeno con el metodo Arrays.sort los caracteres alfabeticamente
        Arrays.sort(string2AChar);

        if (palabra1.equals(palabra2)) {
            System.out.println("Estas dos palabras palabras son exactamente iguales, por lo que:");
            return false;

        } else if (palabra1.length() != palabra2.length()) {
            System.out.println("Estas dos palabras tienen diferente numero de letras, por lo que:");
            return false;

        }
            // System.out.println(string1AChar); // comprobacion de los arrays que deberian estar ordenados
            // System.out.println(string2AChar);
            return Arrays.equals(string1AChar, string2AChar);
    }
}