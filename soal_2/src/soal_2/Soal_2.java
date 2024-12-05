/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;
        import java.util.Scanner;

/**
 *
 * @author LOQ 9
 */
public class Soal_2 {

    /**
     * @param args the command line arguments
     */
   

    public static double hitungLuasPermukaanBola(double r) {
        final double PI = Math.PI;
        return 4 * PI * r * r; // Menghitung luas permukaan bola
    }
    public static double hitungLuasLingkaran(double r) {
        final double PI = Math.PI;
        return PI * r * r;
    }

    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lagi; // Variabel untuk menanyakan kepada pengguna apakah ingin menghitung lagi

        do {
            System.out.print("Masukkan jari-jari: ");
            double jariJari = scanner.nextDouble();
            
                        double luaspermukaanLingkaran = hitungLuasLingkaran(jariJari);
                        System.out.printf("Luas Lingkaran dengan jari-jari %.2f adalah %.2f%n", jariJari, luaspermukaanLingkaran);


            // Menghitung luas permukaan bola
            double luasPermukaanBola = hitungLuasPermukaanBola(jariJari);
            System.out.printf("Luas permukaan bola dengan jari-jari %.2f adalah %.2f%n", jariJari, luasPermukaanBola);

            // Menanyakan kepada pengguna apakah ingin menghitung lagi
            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            lagi = scanner.next();
        } while (lagi.equalsIgnoreCase("ya")); // Loop akan terus berjalan jika pengguna menjawab "ya"

        scanner.close(); // Menutup scanner
    }
}
