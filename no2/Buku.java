package no2;

class Buku {
    private String judul;
    private String genre;

    public Buku(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Judul: " + judul + ", Genre: " + genre;
    }
}