package Ejercicio101ClasesAlbumDeFotos;

public class MainAlbumDeFotos {

    public static void main(String[] args) {

        /*
Comienza creando una clase llamada AlbumFotos con un atributo privado numPaginas de tipo int. Además, incluye un méto.do público GetNumeroPaginas que devolverá el número de páginas del álbum de fotos.

El constructor predeterminado creará un álbum con 16 páginas. Se proporcionará un constructor adicional que nos permitirá especificar el número de páginas deseado para el álbum.

Adicionalmente, existe una clase llamada SuperAlbumFotos cuyo constructor creará un álbum con 64 páginas.

Para complementar el ejercicio, crea una clase AlbumTest que llevará a cabo las siguientes acciones:

Crear un álbum de fotos predeterminado y mostrar el número de páginas.
Crear un álbum de fotos con 24 páginas y mostrar el número de páginas.
Crear un gran álbum de fotos y mostrar el número de páginas.

Desglose tareas:
-Clase AlbumFotos con atributo numPaginas de tipo int
-Metodo GetNumeroPaginas public que devuelve integer numPaginas                     //QUE GUARDA
-Constructor crea album 16 paginas
-otro constructor nos permite especificar numero paginas deseado (pedir usuario)    // NO pedir usuario, se da en el metodo acciones, no hay interaccion user
-Clase SuperAlbumFotos constructor crea album 64 paginas                            // como crea album, EXTIENDE de AlbumFotos
-Clase AlbumTest que:
    -Crea albumFotos predet. y muestra numPaginas
    -Crea albumFotos de 24 paginas y muestra numPaginas
    -Crea SuperAlbumFotos y muestra numPaginas
                                                                                    -// EXTRA llamar al metodo acciones en el main, para que AlbumTest ejecute las acciones requeridas
         */

        AlbumTest.acciones();

            }

}