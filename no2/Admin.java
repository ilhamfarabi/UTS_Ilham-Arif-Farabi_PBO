package no2;

class Admin extends Pengguna {
    public Admin(String username, String password) {
        super(username, password);
    }


    public void aksesPerpustakaan() {
        System.out.println("Admin " + getUsername() + " dapat menambah, melihat, dan menghapus buku.");
    }

    public void tambahBuku(String judul, String genre) {
        BukuDatabase.tambahBuku(new Buku(judul, genre));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void lihatBuku() {
        BukuDatabase.lihatBuku();
    }

    public void hapusBuku(String judul) {
        BukuDatabase.hapusBuku(judul);
        System.out.println("Buku berhasil dihapus.");
    }
}