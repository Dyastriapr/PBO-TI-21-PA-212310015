package com.ibik.pbo.praktikum;

import java.awt.event.*;
import javax.swing.*;

public class Latihan02 extends JFrame {
    
    private JButton btn_submit;
    private JComboBox<String> selectCountry;
    private JRadioButton gender_laki, gender_cewe;
    private JTextField txt_phone, txt_email, txt_nama;
    private ButtonGroup gender_group;
    private final String[] country = {"Indonesia", "Malaysia", "Singapore", "Thailand", "Philiphines",
                                      "Vietnam", "Laos", "Kamboja , Other"};

    Latihan02() {
        setTitle("Latihan 02");
        setVisible(true);
        pack();
        setSize(370, 390);
        setLocationRelativeTo(null);
        setLayout(null);
        GenerateForm(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Latihan02();
    }

    private void GenerateForm(Latihan02 frame) {
        JLabel label_fullname = new JLabel("Nama Lengkap");
        txt_nama = new JTextField();
        label_fullname.setBounds(20, 20, 120, 20);
        txt_nama.setBounds(150, 20, 160, 25);

        frame.add(label_fullname);
        frame.add(txt_nama);

        JLabel label_email = new JLabel("Email");
        txt_email = new JTextField();
        label_email.setBounds(20, 60, 80, 20);
        txt_email.setBounds(150, 60, 160, 25);
        
        frame.add(label_email);
        frame.add(txt_email);

        JLabel label_phone = new JLabel("Phone");
        txt_phone = new JTextField();
        label_phone.setBounds(20, 100, 80, 20);
        txt_phone.setBounds(150, 100, 160, 25);

        frame.add(label_phone);
        frame.add(txt_phone);

        JLabel label_gender = new JLabel("Kelamin");
        label_gender.setBounds(20, 140, 80, 20);
        frame.add(label_gender);
        
        gender_laki = new JRadioButton("Pria");
        gender_cewe = new JRadioButton("Wanita");
        gender_laki.setBounds(150, 140, 80, 20);
        gender_cewe.setBounds(240, 140, 80, 20);
        
        gender_group = new ButtonGroup();
        gender_group.add(gender_laki); gender_group.add(gender_cewe);

        frame.add(gender_laki); frame.add(gender_cewe); 

        JLabel label_citizenship = new JLabel("Kewarganegaraan");
        label_citizenship.setBounds(20, 180, 120, 20);
        frame.add(label_citizenship);

        selectCountry = new JComboBox<String>(country);
        selectCountry.setBounds(150, 180, 160, 25);
        frame.add(selectCountry);

        btn_submit = new JButton("SUBMIT");
        btn_submit.setBounds(100, 250, 160, 40);
        frame.add(btn_submit);

        Submit(this);
    }

    private void Submit(Latihan02 val) {
        btn_submit.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_nama.getText().isEmpty() 
                		|| txt_email.getText().isEmpty() 
                		|| txt_phone.getText().isEmpty() 
                		|| (!gender_laki.isSelected() && !gender_cewe.isSelected())) {
                    JOptionPane.showMessageDialog(null,"Ada data yang belum diisi , Isi semua data yas!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
                } else {
                    if(e.getSource() == btn_submit) {
                        String output = "";
                        String outputKelamin = "";
    
                        if(gender_laki.isSelected()) {
                            outputKelamin = gender_laki.getText();
                            output += "Nama Lengkap: " + txt_nama.getText() + "\n"
                                + "Email: " + txt_email.getText() + "\n"
                                + "No. Telp: " + txt_phone.getText() + "\n"
                                + "Jenis Kelamin: " + outputKelamin + "\n"
                                + "Kewarganegaraan: " + selectCountry.getSelectedItem();
                        } else {
                            outputKelamin = gender_cewe.getText();
                            output += "Nama Lengkap: " + txt_nama.getText() + "\n"
                                + "Email: " + txt_email.getText() + "\n"
                                + "No. Telp: " + txt_phone.getText() + "\n"
                                + "Jenis Kelamin: " + outputKelamin + "\n"
                                + "Kewarganegaraan: " + selectCountry.getSelectedItem();
                        }
    
                        JOptionPane.showMessageDialog(null, output);
                    }
                }
            }
            
        });
    }

}