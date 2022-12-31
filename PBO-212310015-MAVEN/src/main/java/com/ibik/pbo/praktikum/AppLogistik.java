package com.ibik.pbo.praktikum;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppLogistik {
    
    public static boolean isExit = false;
    public static  ArrayList <Integer> orders = new ArrayList<Integer>();
   
   
    public static void main(String[] args) {
    
       ArrayList <String> menu = new ArrayList<String>();

       menu.add("Input Order");
       menu.add("Tracking Order");
        // String label = "Pilih menu dibawah ini: ";
        String menuOutput = " ";
        menuOutput += "Pilih menu dibawah ini" + "\n";
        for(int i = 0; i< menu.size(); i++){
            menuOutput += (i+1) + " "+ menu.get(i) + "\n";
        }
        
        // while (isExit == false) {
            String choose = JOptionPane.showInputDialog(null,  menuOutput, "Menu", JOptionPane.QUESTION_MESSAGE);

            int pilih = Integer.parseInt(choose);

        //     if (choose != null) {
                
                switch (pilih) {
                    case 1:{
                        inputOrder();
                        break;
                    }
                        case 2:{
                        TrackingOrder();
                        break;
                        }
                    default:{
                        ExitApps("");
                    }
                }
            // }else{
            //     JOptionPane.showInputDialog(null, "Apakah Anda Ingin Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            // }
        }

    public static void ExitApps(String value) {
        int isConfirm = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar: ", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        isExit = (isConfirm == 1) ? false : true;
        
    }

    public static void inputOrder() {

    
        String field [] = {"Berat", "Jarak"};

        for(int i = 0; i<field.length; i++){
            String value = JOptionPane.showInputDialog(null, "Masukkan "+ field[i], JOptionPane.QUESTION_MESSAGE);
            int values = Integer.parseInt(value);
            orders.add(values);
            
        }
      long Total =  CalculatePay(orders.get(0), orders.get(1));  
      orders.add((int) Total);

      CetakResi();

      String output = " ";
      output += "Total Ongkir: " + Total + "\n";
      output += "Nomor Resi: " + CetakResi();
       JOptionPane.showMessageDialog(null, output);
       
    }

    public static long CalculatePay(int berat, int jarak) {
        
        long hargaB = 5000;
        long hargaJ = 8000;

        long totalB = (berat/100) *hargaB;
        long totalJ = (jarak/10) *hargaJ;

        long total = totalB + totalJ;

        return total;
    }

    public static String CetakResi() {
        String resi = "XYZ";
        long noResi = (long) (Math.random() * 10000);
        String NoResi = resi + noResi;

        return NoResi;
    }
    public static void TrackingOrder() {
        String field[] = {"Berat", "Jarak"};
        String output = "";
         String resi =CetakResi();
         long total = CalculatePay(orders.get(0), orders.get(1));
         
         for (int i=0; i<orders.size(); i++){

            output += field[i] + " = " + orders.get(i) + "\n";
         }

         output += "Total Harga = " + total + "\n";
         output += "Nomer Resi = " + resi;

         JOptionPane.showMessageDialog(null, output, "Tracking Orders", JOptionPane.INFORMATION_MESSAGE);
    }
   
}