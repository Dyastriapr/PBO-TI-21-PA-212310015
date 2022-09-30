import java.util.Scanner;

public class latihan04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Inputan
		Scanner input = new Scanner (System.in);	
		System.out.println("Masukan Bilangan yang ingin di faktorisasikan");

		        System.out.print("Masukkan angka : ");
		        int nilai = input.nextInt();
		        System.out.println("Faktor-faktornya:");
		        int tambah = nilai;
		        
		        //PERULANGAN DESC
		        for (int i = nilai; i > 0; i--) {
		            if (nilai % tambah == 0) {
		                System.out.print(tambah + "");
		            }
		            tambah--;
		        }
		        input.close();
		    }	
	}
