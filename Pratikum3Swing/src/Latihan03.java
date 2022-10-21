import javax.swing.JOptionPane;

public class Latihan03 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Selamat Datang!");
		final String WARN = "PERINGATAN!";
		boolean isLanjut = true;
		int keluar ;

		while(isLanjut) {
			String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap Anda:", "Form Nama", JOptionPane.QUESTION_MESSAGE);


			if(nama.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Nama tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
		


			String usia = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Form Usia", JOptionPane.QUESTION_MESSAGE);
			final String REG_NUMERIK = "[0-9]+";

			if(usia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Usia tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
			} else if(!usia.matches(REG_NUMERIK)) {
				JOptionPane.showMessageDialog(null, "Harus memakai angka", WARN, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}


			String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat Anda:", "Form Alamat", JOptionPane.QUESTION_MESSAGE);

			if(alamat.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Alamat tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
			} else if(alamat.length() < 10) {
				JOptionPane.showMessageDialog(null, "Masukkan alamat minimum 10 karakter!", WARN, JOptionPane.WARNING_MESSAGE);
			}

			int pUsia = Integer.parseInt(usia);           

			JOptionPane.showMessageDialog(
					null, 
					"Nama lengkap : "+nama+"\nUmur :" + usia +"\nAlamat :"+alamat ,
					"Output Message", 
					JOptionPane.INFORMATION_MESSAGE);

		}

	}

}