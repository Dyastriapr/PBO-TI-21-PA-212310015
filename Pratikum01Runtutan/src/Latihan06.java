import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
		String usia ;
		String firstname ;
		String lastname;
		String npm ;
		Scanner Keyboard = new Scanner(System.in);

		
		System.out.print("Masukan Usia :");	
		usia = Keyboard.nextLine();
		System.out.print("Masukan Nama Depan :");
		firstname = Keyboard.nextLine();
		System.out.print("Masukan Nama Belakang :");
		lastname = Keyboard.nextLine();
		System.out.println("Masukan NPM :");
		npm = Keyboard.nextLine();
		
		System.out.println(usia.concat(firstname).concat(lastname).concat(npm));
	}

}
