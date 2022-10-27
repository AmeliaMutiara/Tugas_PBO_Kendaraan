/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author LK5_28
 */
public class nilai {
    public static void main(String[] args) {
        int nilai;
        String nama;
        
        Scanner kelulusan = new Scanner(System.in);
        System.out.println("Masukkann nama anda : ");
        nama = kelulusan.nextLine();
        System.out.println("Berapa nilai anda ? ");
        nilai = kelulusan.nextInt();
        
        if (nilai >= 90){
            System.out.println("Nilai anda A");
        } else if (nilai >= 80) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 75) {
            System.out.println("Nilai anda C");
        } else {
            System.out.println("Nilai anda D");
        }
    }
}
