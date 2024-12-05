/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1;
        import java.util.Scanner;

/**
 *
 * @author LOQ 9
 */
public class Soal_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

         System.out.print("Apakah Anda memiliki kartu member? : ");
        String isMember = scanner.nextLine().trim().toLowerCase();

        System.out.print("Masukkan total belanja Anda: ");
        double totalBelanja = scanner.nextDouble();

        double diskon = 0;
        if (isMember.equals("ya")) {
            diskon = hitungDiskon(totalBelanja);
        }

        double totalBayar = hitungTotalBayar(totalBelanja, diskon);

        tampilkanHasil(totalBelanja, diskon, totalBayar, isMember);
    }

    public static double hitungDiskon(double totalBelanja) {
        double diskon = 0;
        if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            diskon = totalBelanja * 0.10;
        } else if (totalBelanja > 200000) {
            diskon = totalBelanja * 0.20;
        }
        return diskon; 
    }

    public static double hitungTotalBayar(double totalBelanja, double diskon) {
        return totalBelanja - diskon;
    }

    public static void tampilkanHasil(double totalBelanja, double diskon, double totalBayar, String isMember) {
        System.out.println("\n=== Rincian Belanja ===");
        System.out.println("Status member: " + (isMember.equals("ya") ? "Member" : "Bukan Member"));
        System.out.println("Total belanja: Rp" + totalBelanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
    }
}

 
        

    
    
