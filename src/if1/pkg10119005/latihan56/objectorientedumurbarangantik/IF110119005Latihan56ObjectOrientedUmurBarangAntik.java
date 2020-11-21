/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan56.objectorientedumurbarangantik;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan umur dari sebuah barang antik
 *                     dengan berbasis objek
 */
public class IF110119005Latihan56ObjectOrientedUmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio barang;
        
        barang = new Radio(234);
        barang.setName("Radio AM");
        barang.getName();
        barang.tampilUmur();
    }
    
}