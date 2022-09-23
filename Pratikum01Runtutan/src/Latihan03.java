
public class Latihan03 {
	public static void main(String[] args) {
		
		 SegitigaKerucut();
		 Tabung();
		 	 
	} 
	 static void SegitigaKerucut() {
		 
		 double phi = 3.14 ;
		 float r = 6;
		 float t = 6; 
		 float s = 8;
		 double La = (phi*r*r) ;
		 double Lp = (phi*r*(s + r));
		 double v = 0.33*(La)*(t) ;

		 System.out.println("----Segitiga Kerucut-----");
		 System.out.println("Luas Alas = "+La);
		 System.out.println("Luas Permukaan = "+Lp);
		 System.out.println("Volume = "+v);
	 }
	 static void Tabung() {
		 
		 double phi = 3.14 ;
		 float r = 3;
		 float t = 2;
		 float v = (float) (phi*r*r*t) ;
		 float Lp = (float) ((float) 2*phi*r*(r+t)); 
		 
		 System.out.println("----Tabung----");
		 System.out.println("Volume = "+v);
		 System.out.println("Luas Permukaan = "+Lp);
		 
	 }
	 
	}
