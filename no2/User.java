package no2;

class User extends Pengguna {
    public User(String username, String password) {
        super(username, password);
    }

    public void aksesPerpustakaan() {
        System.out.println("User " + getUsername() + " dapat melihat buku.");
    }
}