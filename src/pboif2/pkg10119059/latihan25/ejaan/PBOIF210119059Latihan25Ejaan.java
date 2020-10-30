/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi mengeja nama
 */
package pboif2.pkg10119059.latihan25.ejaan;

/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBOIF210119059Latihan25Ejaan {
    
    public static void ejaan(String nama, int panjang){
    for (int i=0; i<panjang; i++){
        char eja = nama.charAt(i);
        int no = i+1;
        System.out.println("Huruf ke-"+no+" : "+eja);
        }
    }   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nama;
    int panjang;
    
    System.out.print("Masukkan nama depan anda untuk di eja : ");
    nama = input.next();
    panjang = nama.length();
    System.out.println("");
    System.out.println("Ejaan untuk " + "'"+nama+"'"+" adalah :");
    ejaan(nama,panjang); 
    
    }
    
}
