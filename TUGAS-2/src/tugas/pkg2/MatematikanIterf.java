/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
interface OperasiMatematika {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

class Matematika implements OperasiMatematika {
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        return a / b;
    }
}

public class MatematikanIterf {
    public static void main(String[] args) {
        OperasiMatematika operasi = new Matematika();

        int angka1 = 20;
        int angka2 = 10;

        System.out.println("Pertambahan: " + angka1 + " + " + angka2 + " = " + operasi.pertambahan(angka1, angka2));

        angka1 = 10;
        angka2 = 5;
        System.out.println("Pengurangan: " + angka1 + " - " + angka2 + " = " + operasi.pengurangan(angka1, angka2));

        angka1 = 10;
        angka2 = 3;
        System.out.println("Perkalian: " + angka1 + " * " + angka2 + " = " + operasi.perkalian(angka1, angka2));

        angka1 = 21;
        angka2 = 2;
        System.out.println("Pembagian: " + angka1 + " / " + angka2 + " = " + operasi.pembagian(angka1, angka2));
    }
}

