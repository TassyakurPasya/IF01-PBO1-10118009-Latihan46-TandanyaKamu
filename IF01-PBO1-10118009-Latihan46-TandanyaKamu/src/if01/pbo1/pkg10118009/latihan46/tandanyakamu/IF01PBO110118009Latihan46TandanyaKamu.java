/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = tandanya kamu
 * @author LENOVO
 */
public class IF01PBO110118009Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Age age = new Age(2019);
        System.out.print("Masukan Tahun lahir anda : ");
        age.setYearBirth(input.nextInt());
        System.out.println("Tahun sekarang : 2019 ");
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" umur");
        System.out.println("Tandanya kamu : "+age.red+age.tandanyaKamu(age.hitungUmur()));
        
        
       
        
        
    }
    
}
