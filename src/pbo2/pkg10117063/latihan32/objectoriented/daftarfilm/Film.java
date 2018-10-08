/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan32.objectoriented.daftarfilm;

/*Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan data film
 */
public class Film {
    public String Nama;
    public String Genre;
    public Double Rating;
    public int Duration;
    
    public void nowPlaying (String nama,String genre,Double Rating,int Duration){
            
        System.out.println("\nJudul Film : " + nama);    
        System.out.println("Genre Film : " + genre);    
        System.out.println("Rating Film : " + Rating);    
        System.out.println("Duration Film : " + Duration + " Menit");    
            
    
}
}