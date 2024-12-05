/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_3;
        import java.util.Scanner;

/**
 *
 * @author LOQ 9
 */
public class Soal_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Variabel dan konstanta
        final int JUMLAH_KEHADIRAN = 24; // Konstanta untuk jumlah hari kerja dalam sebulan
        int jumlahSiswa;                 // Variabel untuk jumlah siswa

        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = scanner.nextInt();

        int[] hariHadir = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
        }

        int totalKehadiran = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            totalKehadiran += hariHadir[i];
        }

        double rataRataKehadiran = (double) totalKehadiran / jumlahSiswa;

        // Output rekap kehadiran siswa
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah kehadiran: " + JUMLAH_KEHADIRAN + "):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }
  
        System.out.printf("\nRata-rata kehadiran siswa: %.2f hari\n", rataRataKehadiran);

        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
             if (hariHadir[i] > rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRataKehadiran) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
    }
} 