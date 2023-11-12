import java.util.Scanner;
public class HewanBeraksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Kucing meow = new Kucing(null);
		Anjing asw = new Anjing(null);
		System.out.print("Masukan jenis hewan: ");
		String hewan = input.nextLine();
		if(hewan.equalsIgnoreCase("Kucing")) {
			meow.bersuara();
		}else if (hewan.equalsIgnoreCase("Anjing")) {
			asw.bersuara();
		}else {
			System.out.println("Jenis hewan ini tidak dikenal.");
		}
		
		System.out.print("\nApakah anda Ingin melihat hewan ini jenis apa? (Y/N): ");
		String pil = input.nextLine();
		if (pil.equalsIgnoreCase("Y")) {
			if(hewan.equalsIgnoreCase("Kucing")) {
				meow.jenis();
			} else if (hewan.equalsIgnoreCase("Anjing")) {
				asw.jenis();
			}else {
				System.out.println("kami tidak tahu.");
			}
		} else if(pil.equalsIgnoreCase("N")){
			System.out.println(".");
		}else {
			System.out.println("kalo gamau liat yaudaa.");
		}
	}

}
