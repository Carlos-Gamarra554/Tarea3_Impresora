package Ej2;

public class Impresora {
    private int nivelToner;
    private int numPaginas;
    private boolean aDobleCara;

    public Impresora(int nivelToner, int numPaginas, boolean aDobleCara) {
        this.nivelToner = nivelToner;
        this.numPaginas = numPaginas;
        this.aDobleCara = aDobleCara;
    }

        public void setNivelToner(int num) {
            System.out.println("Nivel del toner actual: " + nivelToner);
            if (num < 0 || num > 100) {
                System.out.println(-1);
            } else if (nivelToner + num > 100) {
                nivelToner = 100;
                System.out.println("Nivel del toner actual: " + nivelToner);
            } else {
                nivelToner += num;
                System.out.println("Nivel total del toner: " + nivelToner);
            }
        }

        public void imprimirPaginas(int paginas) {
            if (aDobleCara) {
                numPaginas += paginas/2;
                System.out.println("Páginas a imprimir: " + paginas/2);
            } else {
                numPaginas += paginas;
                System.out.println("Páginas a imprimir: " + paginas);
            }
        }

        public int getNumPaginas() {
            return numPaginas;
        }
}
