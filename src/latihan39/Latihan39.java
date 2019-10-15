/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan39;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CariNilai cn = new CariNilai();
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = sc.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jml_mhs = sc.nextInt();
        int[] nilai_mhs = new int[jml_mhs];
        for (int i = 0; i < jml_mhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilai_mhs[i] = sc.nextInt();
        }
        System.out.println("Nilai Terbesar adalah "+cn.cariTerbesar(nilai_mhs));
        System.out.println("Nilai Terkecil adalah "+cn.cariTerkecil(nilai_mhs));
        System.out.println("\nPetugas "+petugas);
    }
    
}
