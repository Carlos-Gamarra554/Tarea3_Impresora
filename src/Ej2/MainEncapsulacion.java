package Ej2;

import java.util.Scanner;

public class MainEncapsulacion {
    public static void main(String[] args) {
        Impresora impresora = new Impresora(50,35,false);
        System.out.println("Total de hojas impresas: " + impresora.getNumPaginas());

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de páginas que quieres imprimir: ");
        int paginas = sc.nextInt();
        impresora.imprimirPaginas(paginas);

        System.out.println("Total de hojas impresas: " + impresora.getNumPaginas());

        System.out.print("Introduce la cantidad de toner que quieres añadir(0-100): ");
        int num = sc.nextInt();
        impresora.setNivelToner(num);
    }
}
