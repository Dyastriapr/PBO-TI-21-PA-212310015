package com.ibik.pbo.praktikum;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;

public class Latihan01 extends JFrame implements ActionListener {

    private JButton btn_halo1, btn_halo2, btn_ibik;

    Latihan01() {
        setTitle("Latihan 01");
        setVisible(true);
        pack();
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateMenuButton(this);
    }

    public static void main(String[] args) {
        new Latihan01();
    }

    public void GenerateMenuButton(JFrame frame) {
        JPanel upperPanel = new JPanel();
        btn_halo1 = new JButton(" こんにちは");
        btn_halo2 = new JButton("你好");

        upperPanel.add(btn_halo1);
        upperPanel.add(btn_halo2);

        JPanel bottomPanel = new JPanel();
        btn_ibik = new JButton("IBIK");
        
        bottomPanel.add(btn_ibik);
        
        frame.add(upperPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        btn_halo1.addActionListener(this);
        btn_halo2.addActionListener(this);
        btn_ibik.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_halo1) {
            JOptionPane.showMessageDialog(null, "こんにちは ( Konichiwa) is a word of Halo");
        } else if(e.getSource() == btn_halo2) {
            JOptionPane.showMessageDialog(null, "你好 ( Nihao) is a word of Halo");
        } else if(e.getSource() == btn_ibik) {
            JOptionPane.showMessageDialog(null, "Intitut Bisnis & Informatika Kesatuan");
        }
    }
}