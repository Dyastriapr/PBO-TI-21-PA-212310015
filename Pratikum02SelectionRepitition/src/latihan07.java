import java.util.Scanner;

class Resto {
	private long harga;
	
	public void chooseMenu() {
		Scanner input = new Scanner(System.in);// buat input
	// deklarasi variable
		boolean pilihan = true;
		String pilihLanjut;
		int pilihanMenu;
	
		while(pilihan) { //perulangan y	es or no
			
			//pilih menu
			System.out.println("====PROGRAM PILIH MENU SARAPAN====\n");
			System.out.println("Menu Sarapan:");
			System.out.println("1. Nasi Goreng \n2. Bubur Ayam \n3. Soto Ayam ");
			System.out.print("Pilihan : ");
			pilihanMenu = input.nextInt();
			
			// fungsi buat ngambil harga
			getPrices(pilihanMenu);
			
			System.out.print("\nApakah Anda ingin memesan lagi? [Y/N] : ");
			pilihLanjut = input.next();
			
			//menentukan pilihan yes or no
			if(pilihLanjut.equalsIgnoreCase("Y")) {
				continue;
			} else if(pilihLanjut.equalsIgnoreCase("N")) {
				System.out.println("Terima kasih telah memesan");
				break;
			} else {
				System.out.println("Pilihan yang Anda masukkan salah!");
			}
		}
		input.close();
	}
	//fungsi hak akses private 
	private long getPrices(int pilih) {
		switch(pilih) {
			case 1:
				harga = 22000;
				System.out.println("Harga Nasi Goreng = Rp " + harga);
			break;
			case 2:
				harga = 15000;
				System.out.println("Harga Bubur Ayam = Rp " + harga);
			break;
			case 3:
				harga = 25000;
				System.out.println("Harga Soto Ayam = Rp " + harga);
			break;
			default:
				System.out.println("Pilihan tidak ada");
		}		
		return pilih;
	}
}

public class latihan07 {
	
	public static void main(String[] args)  {
		Resto restoran = new Resto(); // mendeklarasikan fungsi dari class resto
		
		restoran.chooseMenu();		
	}

}