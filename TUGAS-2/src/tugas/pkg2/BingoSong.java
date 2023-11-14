/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author ASUS
 */
public class BingoSong {
    public BingoSong() {
        String line1 = "There was a farmer who had a dog,\nAnd Bingo was his name-o.";
        System.out.println(line1);

        String line2 = "B-I-N-G-O";
        for (int i = 0; i < 3; i++) {
            System.out.println(line2);
        }
        System.out.println("And Bingo was his name-o.");

        for (int i = 0; i < 5; i++) {
            String clap = "";
            for (int j = 0; j < i; j++) {
                clap += "(clap)-";
            }
            String line = clap + line2.substring(i * 2);
            for (int k = 0; k < 3; k++) {
                System.out.println(line);
            }
            System.out.println("And Bingo was his name-o.");
        }
    }
}
