/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika matematika = new Matematika();

        int angka1 = 20;
        int angka2 = 10;

        System.out.println("Pertambahan: " + angka1 + " + " + angka2 + " = " + matematika.pertambahan(angka1, angka2));

        angka1 = 10;
        angka2 = 5;
        System.out.println("Pengurangan: " + angka1 + " - " + angka2 + " = " + matematika.pengurangan(angka1, angka2));

        angka1 = 10;
        angka2 = 3;
        System.out.println("Perkalian: " + angka1 + " * " + angka2 + " = " + matematika.perkalian(angka1, angka2));

        angka1 = 21;
        angka2 = 2;
        System.out.println("Pembagian: " + angka1 + " / " + angka2 + " = " + matematika.pembagian(angka1, angka2));
    }
    
}
