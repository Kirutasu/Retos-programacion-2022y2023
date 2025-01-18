package Ejercicio04Primos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         *
         * Desglose de tareas:
         * -Recibir un numero (nextint)
         * -comprobar primo
         * -for de 2 a X donde x es numero (2 < x porque entre 1 siempre saldra X, y entre X saldrá 1)
         * -dividir X entre cada i del bucle for. Cuando salga % == 0, devuelve false por tanto ese numero NO es primo
         * -Si sale primo, añadir a array.
         * -Imprimir numeros primos entre 1 y 100 (mismo bucle for pero i= 1 y X sea 101) imprimir array resultante
         */

        Scanner scanner = new Scanner(System.in);
        int comprobar;
        ArrayList<Integer> arrayListDivisores = new ArrayList<>(); // un arrayList nos permite no definir longitud y podremos añadir mas tarde elementos, segun vayan apareciendo (que seran divisores)
        // ArrayList<Integer> arrayList100Divisores = new ArrayList<>(); // otro solo para los divisores de 1 a 100 (seguramente se pudiera mejorar directamente todo en un mismo metodo)

        System.out.println("Escribe qué numero quieres comprobar si es primo"); //asumimos que entrará un entero positivo, se podrian añadir estas comprobaciones
        comprobar = scanner.nextInt(); // leemos el entero

        for (int i = 1; i <= comprobar; i++) { // recorremos posiciones desde 1 hasta el numero introducido (y no su raiz cuadrada, que ganariamos eficiencia pero tendriamos luego problemas al contabilizar divisores, pudiendose complicar el codigo)
            if (comprobar % i == 0) { // si el resto da 0, el numero introducido se puede dividir por este numero (i)
                arrayListDivisores.add(i); // añadimos el divisor en cuestion a la lista de divisores, para decidir si es primo o no al final
                // System.out.println("Se ha encontrado un nuevo divisor");       (utilizado para comprobar)
            } else {
            }
        }

        System.out.println("Los posibles divisores para " + comprobar + " son:"); // hecho para comprobar los divisores, se podria eliminar
        for (int i = 0; i < arrayListDivisores.size(); i++) { // bucle for para recorrer el array e irlo imprimiendo posicion a posicion
            System.out.println(arrayListDivisores.get(i));
        }

        if (arrayListDivisores.size() > 2) { // si la lista de divisores es mayor que 2 (que deberia ser el minimo, el 1 y el propio numero introducido) entonces NO será un numero primo
            System.out.println("Este numero (" + comprobar + ") NO es un numero primo");
        } else {
            System.out.println("Este numero (" + comprobar + ") SI es un numero primo");
        }

/*
        for (int i = 2; i <= 100; i++) { // recorremos todos los numeros de 2 a 100 para encontrar primos entre ellos
            for (int j = 2; j < i; j++) { // otro for, para dividir i entre todos los numeros hasta si mismo (sin incluirse). Si encuentra alguno, es que NO es primo (tendria mas divisores)
             if (i % j == 0) { //donde aqui sea true, NO será primo
                 // arrayList100Divisores.add(i); // si encontramos un posible divisor, se guarda en el array (innecesario, no necesitamos lista de divisores)
                 return;
             }
            }
        }
        System.out.println("La lista de numeros primos entre 1 y 100 es la siguiente:");
        for (int i = 0; i < arrayList100Divisores.size(); i++) {
            System.out.println(arrayList100Divisores.get(i));
        }
        */

        System.out.println("La lista de numeros primos entre 1 y 100 es la siguiente:");

        for (int i = 2; i <= 100; i++) { //numeros del 2 al 100, candidatos a primo
            boolean esPrimo = true; // asumimos que son primos de inicio
            for (int j = 2; j <= Math.sqrt(i); j++) { //bucle de 2 a raiz cuadrada de i para buscar divisores
                if (i % j == 0) { // si encontramos un solo divisor, entonces el numero YA NO será primo
                    esPrimo = false;
                    break; // salimos del bucle por eficiencia
                }
            }
            if (esPrimo) { // si es primo, lo imprimimos
                System.out.print(i + " ");
            }
        }
    }
}