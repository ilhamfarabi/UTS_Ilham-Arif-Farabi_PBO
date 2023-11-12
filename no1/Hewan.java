public class Hewan {
    protected String jenisSuara = "yang beneeerrrr haahh??";

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println("Hewan Bersuara: " + jenisSuara);
    }
}