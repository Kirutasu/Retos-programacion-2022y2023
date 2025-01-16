package Ejercicio01Fizzbuzz;

public class Fizzbuzz {

    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */

        /* Desglose  de Tareas:
         * -Mostrar TODOS los numeros de 1 a 100
         * -Mostrarlos CON salto linea cada impresion
         * -SUSTITUIR:
         * -IF multiplo de 3 >> fizz
         * -IF multiplo 5 >> buzz
         * -IF multiplo 3 y 5 >> fizzbuzz
         * -PrintLn
         */

        int numeros = 1;
        String tres = "fizz";
        String cinco = "buzz";
        String trescinco = "fizzbuzz";


        for (int i = 0; i < 100; i++) {
            if ((numeros %3 == 0) && (numeros %5 == 0)) {
                System.out.println(trescinco);
            } else if (numeros %3 == 0){
                System.out.println(tres);
            } else if (numeros %5 == 0) {
                System.out.println(cinco);
            }else {
                System.out.println(numeros);
            }
            numeros++;
        }

    }
}