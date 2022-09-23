import java.util.Scanner;

public class Latihan05 {
 public static void main(String[] args) {
	 String kata ;
	 Scanner Keyboard = new Scanner(System.in);
	 System.out.print(" Masukan Kata atau Kalimat : ");
	 kata = Keyboard.nextLine();
	 System.out.print(kata.toUpperCase());
}
}
