import javax.swing.JOptionPane;

public class latihan06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//deklarasi
		String milih ;
		int pilihan;
		
		//perulangan
		while(true) {
			
			//JoptionPane buat bikin pop up
			milih = JOptionPane.showInputDialog("Menu sarapan : \n"
					+ "1. Nasi Goreng\n"
					+ "2. Bubur Ayam\n"
					+ "3. Soto Ayam \n\n"
					+ "Masukkan pilihan: ");
			
			switch(milih) {
				case "1":
					JOptionPane.showMessageDialog(null, "Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
				break;
				case "2":
					JOptionPane.showMessageDialog(null, "Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
				break;
				case "3":
					JOptionPane.showMessageDialog(null, "Anda memesan Soto Ayam dengan harga Rp 25.000,-");
				break;
				default:
					JOptionPane.showMessageDialog(null, "Pilihan tidak ada!");	
			}
			
			// untuk bikin pilihan yes or no
			pilihan = JOptionPane.showConfirmDialog(null, "Apakah anda akan memesan kembali ? (y/n)");
			if(pilihan == JOptionPane.YES_OPTION) {
				continue;
			} else if(pilihan == JOptionPane.NO_OPTION) {
				break;
			}
		}
	    
		JOptionPane.showMessageDialog(null, "Terimakasih Sudah Berkunjung");
	  
	  }
	}