/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja1;

import java.util.Random;

/**
 *
 * @author Hinagiku
 */
public class JA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random(100);
        Integer[] a = new Integer[5];
        a[0]= r.nextInt(100);
        a[1]= r.nextInt(100);
        a[2]= r.nextInt(100);
        a[3]= r.nextInt(100);
        a[4]= r.nextInt(100);
        System.out.println("Soal 1");
        for(int b : a){
            if(b < 60){
                System.out.println(b +" kurang");
            } else if(b > 60 && b <= 70){
                System.out.println(b +" cukup");
            } else if(b > 70 && b <= 80){
                System.out.println(b +" baik");
            } else if(b > 80){
                System.out.println(b +" luar biasa");
            }
        }
        
        System.out.println("Soal 2");
        JA1.katakLoncat(28);
        JA1.katakLoncat(60);
        
        System.out.println("Soal 3");
        cekKata("Kakak");
        cekKata("Makan");
        
        System.out.println("Soal 5");
        int[][] m = {{11,2,4},{4,5,6},{10,8,-12}};
        diagonal(m);
        
        
        
    }
    
    public static void katakLoncat(int i){
        int besar = i/3;
        int kecil = i%3;
        
        System.out.println(besar +" Loncatan besar dan " +kecil +" Loncatan kecil");
    }
    
    public static void diagonal(int[][] d){
        int a = d.length;
        int dKanan = 0;
        int dKiri = 0;
        
        for(int i=0; i<a; i++){
            dKanan += d[i][i];
        }
        System.out.println("Jumlah diagonal 1 : " +dKanan);
        
        int j=0;
        for(int i=(a-1);i>=0;i--){
            dKiri += d[i][j];
            j++;
            
        }
        System.out.println("Jumlah diagonal 2 : " +dKiri);
        if(dKanan>dKiri){
            System.out.println("Perbedaan Mutlak Diagonal = " +(dKanan-dKiri));
        } else {
            System.out.println("Perbedaan Mutlak Diagonal = " +(dKiri-dKanan));
        }
    }
    
    public static void cekKata(String kata){
        String[] baris1 = {"q","w","e","r","t","y","u","i","o","p"};
        String[] baris2 = {"a","s","d","f","g","h","j","k","l"};
        String[] baris3 = {"z","x","c","v","b","n","m"};
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        
        kata = kata.toLowerCase();
        for(int i=0; i<baris1.length; i++){
            if(kata.matches(".+"+baris1[i]+".+") || kata.matches(".+"+baris1[i]) || kata.matches(baris1[i]+".+")){
                b1 = true;
                break;
            }
        }
        for(int i=0; i<baris2.length; i++){
            if(kata.matches(".+"+baris2[i]+".+") || kata.matches(".+"+baris2[i]) || kata.matches(baris2[i]+".+")){
                b2 = true;
                break;
            }
        }
        for(int i=0; i<baris3.length; i++){
            if(kata.matches(".+"+baris3[i]+".+") || kata.matches(".+"+baris3[i]) || kata.matches(baris3[i]+".+")){
                b3 = true;
                break;
            }
        }
        
        if(b1 && b2 && b3){
            System.out.println("tidak satu baris pada keyboard");
        } else if(b1 && b2){
            System.out.println("tidak satu baris pada keyboard");
        } else if(b2 && b3){
            System.out.println("tidak satu baris pada keyboard");
        } else if(b1 && b3){
            System.out.println("tidak satu baris pada keyboard");
        } else {
            System.out.println("satu baris pada keyboard");
        }
    }
}
