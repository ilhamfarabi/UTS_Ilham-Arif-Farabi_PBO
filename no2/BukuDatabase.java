package no2;

import java.util.ArrayList;
class BukuDatabase {
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();

    public static void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public static void lihatBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }

    public static void hapusBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                daftarBuku.remove(buku);
                break;
            }
        }
    }
}