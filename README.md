
---

# ⚡ Manajemen Token Listrik

Program ini adalah **aplikasi konsol sederhana** yang digunakan untuk mengelola data token listrik pelanggan, termasuk menambah, melihat, mengubah, dan menghapus data token. Program ditulis dalam bahasa **Java** menggunakan paradigma **Object-Oriented Programming (OOP)**.

> 📘 **Catatan:** Proyek ini merupakan *proyek Ujian Akhir Semester (UAS)* dari mata kuliah **Algoritma Pemrograman 1**, dengan tujuan untuk menerapkan konsep dasar algoritma, struktur data dinamis, serta logika pemrograman berbasis objek dalam Java.

---

## 📜 Deskripsi Program

Pengguna dapat menambahkan token listrik baru dengan input: ID Token, Nama Pelanggan, Nomor Meteran, dan Saldo Token. Data disimpan sementara menggunakan **struktur data ArrayList**. Program menampilkan menu pilihan dan akan terus berjalan sampai pengguna memilih keluar dari aplikasi.

---

## 💻 Bahasa yang Digunakan

| Bahasa Pemrograman | Deskripsi                                            |
| ------------------ | ---------------------------------------------------- |
| Java               | Program berbasis OOP dengan class `Token` dan `Main` |

---

## 🧰 Bahasa dan Teknologi

| Bahasa | Teknologi / IDE                                  |
| ------ | ------------------------------------------------ |
| Java   | IntelliJ IDEA / NetBeans / VSCode / Command Line |

---

## 🖥️ Struktur File

```text
src/
├── TokenListrik.java   // Class model token listrik
└── Main.java           // Class utama dengan menu interaktif
```

---

## 🔍 Fitur

* ✅ Input data token listrik
* ✅ Menampilkan semua data token
* ✅ Mengubah data token berdasarkan ID
* ✅ Menghapus data token berdasarkan ID
* ✅ Validasi input saldo tidak boleh negatif
* ✅ Menu CLI (Command Line Interface) interaktif

---

## 💾 Penyimpanan yang Digunakan

Program menyimpan data token listrik menggunakan **ArrayList<TokenListrik>**, yaitu struktur data dinamis dari Java Collection Framework. Data hanya tersimpan selama program berjalan (tidak ada penyimpanan ke file atau database).

```java
List<TokenListrik> listToken = new ArrayList<>();
```

---

## 🧾 Cuplikan Output

```text
=== Aplikasi Manajemen Token Listrik ===
1. Tambah Data Token
2. Lihat Semua Token
3. Ubah Data Token
4. Hapus Data Token
5. Keluar
Pilih menu: 1

Masukkan ID Token       : T001
Masukkan Nama Pelanggan : Budi
Masukkan No. Meteran    : 1234567890
Masukkan Saldo Token    : 50000

Data berhasil ditambahkan!
```

---

## 📇 Kontak Pengembang

* 👤 Nama: **Muhammad Rafli Nurfathan**
* 📧 Email: **[nurfathanrafli85@gmail.com](mailto:nurfathanrafli85@gmail.com)**
* 🔗 LinkedIn: [linkedin.com/in/mhmmdraflin](https://www.linkedin.com/in/mhmmdraflin)

---

