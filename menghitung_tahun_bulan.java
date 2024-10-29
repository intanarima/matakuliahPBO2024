/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intanarimatugaspbo2024;
import java.util.Scanner;

/**
 *
 * @author MY HP
 */
public class menghitung_tahun_bulan {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah hari dari pengguna
        System.out.print("Masukkan jumlah hari: ");
        int totalHari = scanner.nextInt();

        // Menghitung tahun dan bulan
        int tahun = totalHari / 365;
        int sisaHari = totalHari % 365;
        int bulan = sisaHari / 30;

        // Menampilkan hasil
        System.out.println(totalHari + " hari sama dengan " + tahun + " tahun dan " + bulan + " bulan.");

        // Menutup scanner
        scanner.close();
    }
}

