/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intanarimatugaspbo2024;

/**
 *
 * @author MY HP
 */
import java.util.Scanner;
public class IntanarimaTugasZakatPBO2024 {



    public static void main(String[] args) {
        // Meminta pengguna memasukkan jumlah harta dalam bentuk desimal
        try ( // Membuat scanner untuk input pengguna
                Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan jumlah harta dalam bentuk desimal
            System.out.print("Masukkan jumlah harta Anda (dalam bentuk desimal): ");
            double harta = input.nextDouble();
            // Menghitung zakat maal (2.5% dari total harta)
            double zakat = harta * 2.5 / 100;
            // Menampilkan jumlah zakat yang harus dibayarkan
            System.out.printf("Jumlah zakat yang harus dibayarkan: Rp %.2f\n", zakat);
            // Menutup scanner
        }
    }
}