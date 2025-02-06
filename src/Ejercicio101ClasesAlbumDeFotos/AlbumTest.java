package Ejercicio101ClasesAlbumDeFotos;

public class AlbumTest {

public static void acciones () {

    AlbumFotos albumFotos = new AlbumFotos();
    AlbumFotos albumFotos2 = new AlbumFotos(24);
    SuperAlbumFotos superAlbumFotos = new SuperAlbumFotos();

    System.out.println("Creado album predeterminado, tiene " + albumFotos.getNumeroPaginas());
    System.out.println("Creado album de 24 paginas, tiene " + albumFotos2.getNumeroPaginas());
    System.out.println("Creado un gran album de fotos, tiene " + superAlbumFotos.getNumeroPaginas());

}}
