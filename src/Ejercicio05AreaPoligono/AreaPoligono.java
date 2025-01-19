package Ejercicio05AreaPoligono;

import java.util.Scanner;

public class AreaPoligono {

    public static void main(String[] args) {

        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         *
         *
         * Desglose tareas:
         * -una funcion, ergo metodo fuera del main
         * -declarar variables, lado, base, altura, scanner, string...
         * -switch para que se ejecute solo el calculo de area elegido
         * -caso triangulo: dame base, dame altura, formula (BxA)/2
         * -caso cuadrado: dame lado: formula lado x lado
         * -caso rectangulo: dame base y altura, formula BxA
         * -si me da otra cosa, esa palabra o poligono no está soportado. sale de la funcion (potencialmente del programa)
         * -dentro el codigo de un bucle while, para que hasta que no escriba "salir" el programa se siga ejecutando, y poder imprimir el area de un poligono de cada tipo
         * -
         */
        String poligono = "";

        while (true) {
            calcularArea(poligono);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Quieres calcular el area de otro poligono? (Si/No)");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!(respuesta.equals("si"))) {
                System.out.println("El programa se cerrará ahora, gracias!");
                break;
            }
        }
    }

    public static void calcularArea(String poligono) {

        Scanner scanner = new Scanner(System.in);
        long lado = 0;
        long base = 0;
        long altura = 0;
        long resultado = 0;

        System.out.println("Introduce el tipo de polígono cuya area quieres calcular");
        poligono = scanner.nextLine().toLowerCase().replaceAll(" ", "");

        switch (poligono) {

            case "triangulo":
                System.out.println("Introduce la base del triangulo cuya area quieres calcular");
                base = scanner.nextInt();
                System.out.println("Introduce la altura del triangulo cuya area quieres calcular");
                altura = scanner.nextInt();
                resultado = (base * altura) / 2;
                break;

            case "cuadrado":
                System.out.println("Introduce el lado del cuadrado cuya area quieres calcular");
                lado = scanner.nextInt();
                resultado = lado * lado;
                break;

            case "rectangulo":
                System.out.println("Introduce la base del rectangulo cuya area quieres calcular");
                base = scanner.nextInt();
                System.out.println("Introduce la altura del rectangulo cuya area quieres calcular");
                altura = scanner.nextInt();
                resultado = base * altura;
                break;

            default:
                System.out.println("Poligono o palabra introducida no soportados. Hasta la proxima");
                break;
        }
        System.out.println("El area de este poligono es: " + resultado);

        // se podria verificar que introduzca bien un string, o que cuando se equivoque el calculo del area salga null, o cuidar que no rompa el programa con un entero demasiado grande, o con decimales, etc etc...
    }
}