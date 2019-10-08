/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbandinganduabuahnilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
        
public class PerbandinganDuaBuahNilai {
    private static void bandingkan(int a,int b){
        if (a<b)
            System.out.println(a+" Lebih kecil dari "+b);
        else if (a>b)
            System.out.println(a+" Lebih besar dari "+b);
        else
            System.out.println(a+" Sama dengan "+b);        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String ulang = "Ya";
        int b1,b2;
        
        System.out.println("====== Program perbandingan nilai ======");
        do {
            System.out.print("Masukan nilai pertama : ");
            b1 = sc.nextInt();
            System.out.print("Masukan nilai kedua   : ");
            b2 = sc.nextInt();
            bandingkan(b1,b2);
            System.out.println("");
            System.out.print("Ulangi aktifitas ? (Ya/Tidak) : ");
            ulang = sc.next();
            System.out.println();            
        } while(ulang.equals("Ya"));
        
    }
    
}
