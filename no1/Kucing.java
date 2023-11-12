public class Kucing extends Hewan {
	public Kucing(String jenisSuara) {
		super("Meong");
	}

	public void bersuara() {
		System.out.println("Suara Kucing: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Hewan ini adalah Mamalia");
	}
}
