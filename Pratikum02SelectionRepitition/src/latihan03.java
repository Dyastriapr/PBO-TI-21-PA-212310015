import javax.swing.JOptionPane;

public class latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pilih ;
		
		pilih = JOptionPane.showInputDialog("Menu sarapan : \n"
				+ "1. Nasi Goreng\n"
				+ "2. Bubur Ayam\n"
				+ "3. Soto Ayam \n\n"
				+ "Masukkan pilihan: ");
		
		switch(pilih) {
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
	}
}
