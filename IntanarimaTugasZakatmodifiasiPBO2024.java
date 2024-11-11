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

// Kelas untuk menghitung zakat
class ZakatCalculator {
    private double harta;

    // Konstruktor berparameter
    public ZakatCalculator(double harta) {
        this.harta = harta;
    }

    // Setter dan Getter
    public double getHarta() {
        return harta;
    }

    public void setHarta(double harta) {
        this.harta = harta;
    }

    // Metode untuk menghitung zakat maal (2.5% dari total harta)
    public double hitungZakat() {
        return harta * 2.5 / 100;
    }
}

// Kelas untuk menyimpan informasi Donatur
class Donatur {
    private String nama;
    private double jumlahHarta;

    // Konstruktor berparameter
    public Donatur(String nama, double jumlahHarta) {
        this.nama = nama;
        this.jumlahHarta = jumlahHarta;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJumlahHarta() {
        return jumlahHarta;
    }

    public void setJumlahHarta(double jumlahHarta) {
        this.jumlahHarta = jumlahHarta;
    }
}

// Kelas untuk menyimpan informasi Penerima
class Penerima {
    private String nama;
    private String kebutuhan;

    // Konstruktor berparameter
    public Penerima(String nama, String kebutuhan) {
        this.nama = nama;
        this.kebutuhan = kebutuhan;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKebutuhan() {
        return kebutuhan;
    }

    public void setKebutuhan(String kebutuhan) {
        this.kebutuhan = kebutuhan;
    }
}

// Kelas Utama
public class IntanarimaTugasZakatPBO2024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input informasi donatur
        System.out.print("Masukkan nama Donatur: ");
        String namaDonatur = input.nextLine();
        
        System.out.print("Masukkan jumlah harta Donatur (dalam bentuk desimal): ");
        double hartaDonatur = input.nextDouble();
        
        // Membuat objek Donatur dan ZakatCalculator
        Donatur donatur = new Donatur(namaDonatur, hartaDonatur);
        ZakatCalculator zakatCalculator = new ZakatCalculator(hartaDonatur);

        // Menghitung zakat
        double zakat = zakatCalculator.hitungZakat();
        
        // Menampilkan jumlah zakat yang harus dibayarkan
        System.out.printf("Jumlah zakat yang harus dibayarkan oleh %s: Rp %.2f\n", donatur.getNama(), zakat);

        // Input informasi penerima
        input.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan nama Penerima: ");
        String namaPenerima = input.nextLine();

        System.out.print("Masukkan kebutuhan Penerima: ");
        String kebutuhanPenerima = input.nextLine();

        // Membuat objek Penerima
        Penerima penerima = new Penerima(namaPenerima, kebutuhanPenerima);

        // Menampilkan informasi penerima
        System.out.println("\nInformasi Penerima:");
        System.out.println("Nama: " + penerima.getNama());
        System.out.println("Kebutuhan: " + penerima.getKebutuhan());

        input.close();
    }
}
