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
public class LampuLaluLintaskra {
    public static void main(String[] args) {
        //membuat variabel dan scanner
        String lampu;
        Scanner lalulintas = new Scanner(System.in);
        
        //menampilkan output ke user
        System.out.println("Masukkan warna lampu : ");
        lampu = lalulintas.nextLine();
        
        //membuat kondisi
        switch(lampu){
            case "merah" :
                System.out.println("Kendaraan harus berhenti");
                break;
            case "kuning" :
                System.out.println("Kendaraan berhati-hati");
                break;
            case "hijau" :
                System.out.println("Kendaraan berjalan");
                break;
            default :
                System.out.println("Warna yang anda masukkan tidak terdeteksi");
        }
    }
}
