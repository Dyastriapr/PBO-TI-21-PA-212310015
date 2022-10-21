import javax.swing.JOptionPane;
public class Latihan02 {

	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		myBio.setFullname(JOptionPane.showInputDialog(
				null, 
				"Masukan Nama Lengkap :",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));
		
		myBio.setAge(Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"Masukan Umur:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		)));
		
		myBio.setAlamat(JOptionPane.showInputDialog(
				null, 
				"Masukan Alamat:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));

		JOptionPane.showMessageDialog(
				null, 
				"Nama Lengkap :" + myBio.getFullname() 
				+ "\nUmur :" + myBio.getAge() 
				+ "\nAlamat :" + myBio.getAlamat());
	}

}