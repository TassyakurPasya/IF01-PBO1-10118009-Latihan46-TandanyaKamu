/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan46.tandanyakamu;

/**
 *
 * @author LENOVO
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    public static final String red = "\u001B[31m";

    public Age(int yearNow){
        this.yearNow = yearNow;
        
    }
    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    public int hitungUmur(){
       int umur = yearNow - yearBirth;
        return umur;
        
    }
    public String tandanyaKamu(int umur){
        if((umur > 0) && (umur <= 5)){
           return "Lagi Lucu Lucunya";
        }else
        if((umur > 5) && (umur <= 10)){
           return "Masih anak anak";
        }else
        if((umur > 10) && (umur <= 13)){
           return "masih remaja";
        }else
        if((umur > 13) && (umur <= 19)){
           return "alay";
        }else
        if((umur > 19) && (umur <= 29)){
           return "Lagi galau nyari jodoh";
        }else
        if((umur > 29) && (umur <= 35)){
           return "Lagi sibuk nyari uang";
        }else
        if((umur > 35) && (umur <= 150)){
           return "sudah tua";
        }else{
           return "tidak terdeteksi di kehidupan dunia";
        }
       
      
    
        
    }
    
}
