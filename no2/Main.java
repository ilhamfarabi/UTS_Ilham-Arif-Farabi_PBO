package no2;

// Kelas utama
public class Main {
    public static void main(String[] args) {
        User user = new User("user1", "pass123");
        user.aksesPerpustakaan();

        Admin admin = new Admin("admin1", "adminpass");
        admin.aksesPerpustakaan();

        admin.tambahBuku("langit tinggi diangkasa", "novel cinta");
        admin.tambahBuku("10 Soda besar", "Comedy");

        admin.lihatBuku();

        admin.hapusBuku("langit tinggi diangkasa");

        admin.lihatBuku();
    }
}