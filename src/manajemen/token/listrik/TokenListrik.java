/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen.token.listrik;

/**
 *
 * @author NITRO 5
 */
public class TokenListrik {
    private String idToken;
    private String namaPelanggan;
    private String nomorMeteran;
    private double saldo;

    public TokenListrik(String idToken, String namaPelanggan, String nomorMeteran, double saldo) {
        this.idToken = idToken;
        this.namaPelanggan = namaPelanggan;
        this.nomorMeteran = nomorMeteran;
        this.saldo = saldo;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setNomorMeteran(String nomorMeteran) {
        this.nomorMeteran = nomorMeteran;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("ID Token       : " + idToken);
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Nomor Meteran  : " + nomorMeteran);
        System.out.println("Saldo          : Rp" + saldo);
        System.out.println("----------------------------------");
    }
}