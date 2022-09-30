import java.util.Scanner;
public class latihan02 {
    public static void main(String args[])
    {
    	
        Scanner input = new Scanner(System.in);// inputan
        int angka, cek=0; // deklarasi
         
        System.out.println("PROGRAM JAVA MENENTUKAN NPM ADALAH BILANGAN PRIMA ATAU BUKAN");
        System.out.print("Masukan NPM : ");
        angka=input.nextInt();
  
       // perulangan untuk mengecek bilangan prima
        for (int i=2; i<=angka; i++){
            if (angka%i==0){
                cek++;
            } 
        }
        // pilihan jika prima true jika bukan ke else
        if (cek==1){
            System.out.println(angka+" adalah bilangan prima");
        }else {
            System.out.println(angka+" bukan bilangan prima");
           
        } 
        
        
        input.close();
   }
}