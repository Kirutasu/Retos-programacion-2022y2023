package Ejercicio03Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         *
         *
         * Desglose de tareas:
         * -"Este programa imprimirá los primeros 50 numeros de la sucesion de Fibonacci, desde el 0"
         * -Dos ints 0, 1, en formato LONG para cuando crezcan no desborden.
         * -Se imprimen para mostrar los 2 primeros numeros de la sucesion, antes de que se sustituyan sus valores al entrar al bucle
         * -Un for que recorra de 2 a 50 (48 veces, ya que las 2 primeras estan ya impresas)
         * -Dentro del bucle: Se suman ambos ints A y B
         * -Resultado = nuevo int C
         * -Se imprime para añadir el numero a la sucesion visualmente en pantalla
         * -Para el proximo bucle:
         * -Primer int A toma el valor del segundo int B
         * -Segundo int B toma el valor del resultado/nuevo int C
         * -Se vuelve a repetir el bucle, con los nuevos primer A (antiguo B) y segundo int B (antiguo C)
         *
         */

        long a = 0; // usamos LONG en vez de int para evitar el desbordamiento y que se puedan abarcar los numeros mas grandes sin problema
        long b = 1;

        mostrar50Fibonacci(a, b); // evitamos sobrecargar main de cosas, creando un metodo concreto para realizar lo que necesitamos que haga el programa

    }

    public static void mostrar50Fibonacci (long a, long b) {
        System.out.println("La serie Fibonacci se compone por una sucesion de números donde el siguiente numero siempre es la suma de los dos anteriores. \n  A continuacion se muestran los 50 primeros numeros de la serie");
        System.out.println(a); // se muestran los primeros numeros iniciales
        System.out.println(b);

        for (int i=2; i < 50; i++) { // comienza en 2 porque ya imprimimos 0 y 1
            long siguiente = a + b;
            System.out.println(siguiente);

            a = b;
            b = siguiente;
        }

    }
}