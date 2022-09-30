import java.util.Scanner;  
    
public class latihan10 
{  
      
    public static void main(String args[] )  
    {  
        //deklarasi dan inisialisasi  
        int saldo = 100000, tarik, setor;  
        int pin = 240403;
        int inpin;
          
        //membuat scanner untuk inputan  
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan PIN :");
        inpin = sc.nextInt();
          
        while(inpin == pin)
        {  
        	//pilih menu
            System.out.println("ATM");  
            System.out.println("1 Tarik Tunai");  
            System.out.println("2 Setor Tunia");  
            System.out.println("3 Lihat Saldo");  
            System.out.println("4 keluar");  
            System.out.print("Pilih Menu :");  
              
            //ambil pilihan dari user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Masukan uang ingin di tarik:");  
                      
        //tarik uang  
        tarik = sc.nextInt();  
                      
        //cek saldo kalo udah ketarik  
        if(saldo >= tarik)  
        {  
            //saldo dikurang yang di tarik  
            saldo = saldo - tarik;  
            System.out.println("Silahkan ambil uangnya");  
        }  
        else  
        {  
            //tampilan kalo error 
            System.out.println("saldo tidak mencukupi");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("masukan uang yang ingin di setor:");  
                      
        //dapatkan jumlah setore dari pengguna te  
        setor = sc.nextInt();  
                      
        //menambahkan jumlah setor ke total saldo  
        saldo = saldo + setor;  
        System.out.println("uang berhasil di setor");  
        System.out.println("");  
        break;  
   
                case 3:  
        //menampilkan jumlah saldo sekarang  
        System.out.println("saldo : "+saldo);  
        System.out.println("");  
        break;  
   
                case 4:  
        //keluar
        System.exit(0);  
        
        
            }  
        }  
        sc.close();
    }  
}  
