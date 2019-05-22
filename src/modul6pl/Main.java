package modul6pl;

/**
 * Modul 6 PL. 
 * Advanced P
 * rogramming
 * Purpose : to calculate the area of a circle and the volume of a
 * ball.
 *
 * @author Jalu Nusantoro
 * Informatics Engeenering 2E
 * University of Muhammadiyah Malang
 * @version 1.0 12/05/19
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a radius to use for both a circle");
        System.out.print("and a sphere (in inches) : ");
        Modul6PL bola = new Modul6PL();
        bola.hitung();
    }
}
