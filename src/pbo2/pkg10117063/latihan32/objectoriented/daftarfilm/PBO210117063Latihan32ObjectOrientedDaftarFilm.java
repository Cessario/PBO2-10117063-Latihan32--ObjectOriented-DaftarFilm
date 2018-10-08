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
public class PBO210117063Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====Daftar Film Sedang Tayang=====");
        
        Film flm = new Film ();
        flm.Nama = "Venom";
        flm.Genre = "Action";
        flm.Rating = 9.5 ;
        flm.Duration = 120 ;
        flm.nowPlaying (flm.Nama,flm.Genre,flm.Rating,flm.Duration);
        
        Film flm1 = new Film ();
        flm1.Nama = "Wiro Sableng";
        flm1.Genre = "Action,Comedy";
        flm1.Rating = 8.5 ;
        flm1.Duration = 110 ;
        flm1.nowPlaying (flm1.Nama,flm1.Genre,flm1.Rating,flm1.Duration);
        
        Film flm2 = new Film ();
        flm2.Nama = "Deadpool";
        flm2.Genre = "Action,Family Friendly";
        flm2.Rating = 9.5 ;
        flm2.Duration = 95 ;
        flm2.nowPlaying (flm2.Nama,flm2.Genre,flm2.Rating,flm2.Duration);
        
        Film flm3 = new Film ();
        flm3.Nama = "Deadpool2";
        flm3.Genre = "Action,Family Friendly";
        flm3.Rating = 9.0 ;
        flm3.Duration = 120 ;
        flm3.nowPlaying (flm3.Nama,flm3.Genre,flm3.Rating,flm3.Duration);
        
        Film flm4 = new Film ();
        flm4.Nama = "Johnny English";
        flm4.Genre = "Action,Comedy,Chaos";
        flm4.Rating = 9.5 ;
        flm4.Duration = 90 ;
        flm4.nowPlaying (flm4.Nama,flm4.Genre,flm4.Rating,flm4.Duration);
    }
       
    
}
