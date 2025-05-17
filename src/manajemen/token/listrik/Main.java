/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manajemen.token.listrik;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author NITRO 5
 */
public class Main {
static Scanner scanner = new Scanner(System.in);
    static ArrayList<TokenListrik> daftarToken = new ArrayList<>();

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1 -> tambahToken();
                case 2 -> tampilkanToken();
                case 3 -> updateToken();
                case 4 -> hapusToken();
                case 5 -> System.out.println("Keluar dari program. Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    static void tampilkanMenu() {
        System.out.println("\n=== APLIKASI MANAJEMEN TOKEN LISTRIK ===");
        System.out.println("1. Tambah Token");
        System.out.println("2. Lihat Semua Token");
        System.out.println("3. Update Token");
        System.out.println("4. Hapus Token");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    static void tambahToken() {
        System.out.print("ID Token: ");
        String id = scanner.nextLine();
        System.out.print("Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Nomor Meteran: ");
        String meteran = scanner.nextLine();
        System.out.print("Saldo Awal: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        daftarToken.add(new TokenListrik(id, nama, meteran, saldo));
        System.out.println("✅ Token berhasil ditambahkan!");
    }

    static void tampilkanToken() {
        if (daftarToken.isEmpty()) {
            System.out.println("Belum ada data token.");
        } else {
            for (TokenListrik token : daftarToken) {
                token.tampilkanInfo();
            }
        }
    }

    static void updateToken() {
        System.out.print("Masukkan ID Token yang ingin diupdate: ");
        String id = scanner.nextLine();
        boolean ditemukan = false;

        for (TokenListrik token : daftarToken) {
            if (token.getIdToken().equalsIgnoreCase(id)) {
                System.out.print("Nama Pelanggan Baru: ");
                token.setNamaPelanggan(scanner.nextLine());
                System.out.print("Nomor Meteran Baru: ");
                token.setNomorMeteran(scanner.nextLine());
                System.out.print("Saldo Baru: ");
                token.setSaldo(Double.parseDouble(scanner.nextLine()));
                System.out.println("✅ Data berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("❌ ID Token tidak ditemukan.");
        }
    }

    static void hapusToken() {
        System.out.print("Masukkan ID Token yang ingin dihapus: ");
        String id = scanner.nextLine();
        boolean dihapus = daftarToken.removeIf(token -> token.getIdToken().equalsIgnoreCase(id));

        if (dihapus) {
            System.out.println("✅ Token berhasil dihapus.");
        } else {
            System.out.println("❌ ID Token tidak ditemukan.");
        }
    }
}
