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
public class kendaraan {
    public static void main(String[] args) {
        int jumlah;
        Scanner penumpang = new Scanner(System.in);
        
        System.out.println("Berapa jumlah penumpang yang ada ?");
        jumlah = penumpang.nextInt();
        
        switch(jumlah){
            case 1 :
                System.out.println("Menggunakan Kendaraan Sepeda Ontel");
                break;
            case 2 :
                System.out.println("Menggunakan Kendaraan Sepeda Motor");
                break;
            case 3 :
                System.out.println("Menggunakan Kendaraan Becak");
                break;
            case 4 :
                System.out.println("Menggunakan Kendaraan Mobil");
                break;
            default :
                System.out.println("Menggunakan Kendaraan Bus");
        }
    }
}
