/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.umtas.pti.operator.utspbo;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
    
    int gaji_pokok ;
    float thr = 0;
    float masa_kerja;
    
    /*Hiasan*/
    System.out.println("=============================================");
    System.out.println("Identitas Pembuat");
    System.out.println("=============================================");
    System.out.println("Nama   : Tahnia Gita Lestari Azizah");
    System.out.println("NIM    : C1983207022");
    System.out.println("Prodi  : PTI6 ");
    System.out.println("Matkul : Pemrograman Berorientasi Objek");
    System.out.println("============================================");
    System.out.println("Program Perhitungan Gaji Pokok/THR Sederhana");
    System.out.println("============================================");
    /*Inputan data*/
    System.out.print ("Masukan Gaji Pokok : ");
    gaji_pokok = input.nextInt();
    
    System.out.print ("Masukan Jumlah Bulan Kerja : ");
    Scanner sc = new Scanner(System.in);
    masa_kerja = sc.nextFloat();
        
    /*Pemilihan masa kerja dengan fungsi IF*/
    if (masa_kerja >= 12)
    {
       thr = (float)gaji_pokok;
    }
    else if (masa_kerja <= 12)
    {
       thr = (float)(gaji_pokok / 12) * masa_kerja; 
    } 
    
    /*Menampilkan hasil*/
    System.err.println ("Tunjangan Hari Raya (THR) Yang Didapatkan : Rp."+thr);   
    }
    
}
