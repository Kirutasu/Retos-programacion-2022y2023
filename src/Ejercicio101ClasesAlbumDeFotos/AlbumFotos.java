package Ejercicio101ClasesAlbumDeFotos;

public class AlbumFotos {

    private int numPaginas = 16;


    public AlbumFotos () {
    }

    public AlbumFotos (int numP) {
        this.numPaginas = numP;
    }

    public int getNumeroPaginas () {
        return this.numPaginas;
    }

}
