package no2;

// Kelas abstrak untuk menerapkan Abstraction
abstract class Pengguna {
    private String username;
    private String password;

    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode abstrak untuk Polymorphism
    public abstract void aksesPerpustakaan();

    // Encapsulation dengan getter
    public String getUsername() {
        return username;
    }

    // Encapsulation dengan setter
    public void setUsername(String username) {
        this.username = username;
    }

    // Metode untuk mengecek kecocokan username dan password
    public boolean checkCredentials(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}