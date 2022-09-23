import java.util.Date;
import java.util.Scanner;

public class Latihan10 {
	public static void main(String[] args) {
		int qty , produk ,harga , total ;
		Date today = new Date();
		

		
		 	System.out.println("=====================================================");
		 	System.out.println("               TOKO SERBAGUNA IBIK                   ");
		 	System.out.println("=====================================================");
		 	 
		 	Scanner Keyboard = new Scanner(System.in);
		 	System.out.print("Masukan jumlah produk yang dibeli : ");
		 	 
		 	qty = Keyboard.nextInt();
		 	System.out.println(" ");
		 	System.out.println(today.toString());
		 	System.out.print("ITEM		");
		 	System.out.print("QTY	");
		 	System.out.print("HARGA		");
		 	System.out.println("TOTAL");
		 	System.out.println("=====================================================");
		 	
		 	System.out.print("ROTI ENAK	"+qty+"	");
		 	int harga1 = 6300;
		 	System.out.print("Rp."+harga1+"		");
		 	int total1 = qty*harga1;
		 	System.out.println("Rp."+total1);
		 	System.out.println("-----------------------------------------------------");
		 	
		 	Students myBio = new Students();
			String FullName = myBio.getClassName("Dyas Tri Apriliansyah");
			System.out.println("Member = " +FullName);
		 	
		 	
		 	double diskon=0,jumlah = qty ;
		 	if(jumlah %3==0) {
		 		 diskon =(total1*0.05);
		 		System.out.println("Diskon: 5%");
		 	}else{
		 		System.out.println("Anda tidak dapat Diskon");
		 	}
		 	
		 	double subtotal = total1-diskon;
		 	System.out.println("Subtotal :"+subtotal);
		 	
		 	
	}
}
