package com.ibik.praktikum;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerGames extends JFrame implements KeyListener {

    private JLabel lbl_img;
    private ImageIcon emoji_up, emoji_down, emoji_left, emoji_right;

    private String images_path = "C:\\Users\\dyast\\PBO-212310015-Praktikum8\\src\\main\\java\\com\\ibik\\praktikum\\Images";
    private URL m_right, m_up, m_down, m_left;
    
    KeyListenerGames() {
        setTitle("Games");
        setSize(512, 256);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        GenerateGamesUI(this);
        setResizable(false);
    }

    public static void main(String[] args) {
        new KeyListenerGames();
    }

    private void GenerateGamesUI(KeyListenerGames frame) {
        // Initialize URL attribute for images folder path
        m_up = KeyListenerGames.class.getClassLoader().getResource(images_path + "emoji_up.png");
        m_down =  KeyListenerGames.class.getClassLoader().getResource(images_path + "emoji_down.png");
        m_left = KeyListenerGames.class.getClassLoader().getResource(images_path + "emoji_left.png");
        m_right = KeyListenerGames.class.getClassLoader().getResource(images_path + "emoji_right.png");

        // Initialize icon
        emoji_up = new ImageIcon(m_up);
        emoji_down = new ImageIcon(m_down);
        emoji_left = new ImageIcon(m_left);
        emoji_right = new ImageIcon(m_right);
        
        lbl_img = new JLabel();
        lbl_img.setBounds(100, 100, 128, 128);
        lbl_img.setIcon(emoji_right);

        frame.add(lbl_img);
        frame.addKeyListener(frame);
        frame.getContentPane().setBackground(Color.CYAN);
    }

    // Method for checking if the X axis of lbl_img is out of bounds
    private void IsIconXAxisOutOfBounds() {
        if(lbl_img.getX() == 440 || lbl_img.getX() == 450) {
            lbl_img.setLocation(-60, lbl_img.getY());
        } else if(lbl_img.getX() == -60 || lbl_img.getX() == -70){
            lbl_img.setLocation(440, lbl_img.getY());
        }
    }
    
    // Method for checking if the Y axis of lbl_img is out of bounds
    private void IsIconYAxisOutOfBounds() {
        if(lbl_img.getY() == 150 || lbl_img.getY() == 160) {
            lbl_img.setLocation(lbl_img.getX(), -60);
        } else if(lbl_img.getY() == -60 || lbl_img.getY() == -70){
            lbl_img.setLocation(lbl_img.getX(), 150);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
                lbl_img.setLocation(lbl_img.getX()-10, lbl_img.getY());
                lbl_img.setIcon(emoji_left);
                IsIconXAxisOutOfBounds();
            break;
            case 'w':
                lbl_img.setLocation(lbl_img.getX(), lbl_img.getY()-10);
                lbl_img.setIcon(emoji_up);
                IsIconYAxisOutOfBounds();
            break;
            case 's':
                lbl_img.setLocation(lbl_img.getX(), lbl_img.getY()+10);
                lbl_img.setIcon(emoji_down);
                IsIconYAxisOutOfBounds();
            break;
            case 'd':
                lbl_img.setLocation(lbl_img.getX()+10, lbl_img.getY());
                lbl_img.setIcon(emoji_right);
                IsIconXAxisOutOfBounds();
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37:
                lbl_img.setLocation(lbl_img.getX()-10, lbl_img.getY());
                lbl_img.setIcon(emoji_left);
                IsIconXAxisOutOfBounds();
            break;
            case 38:
                lbl_img.setLocation(lbl_img.getX(), lbl_img.getY()-10);
                lbl_img.setIcon(emoji_up);
                IsIconYAxisOutOfBounds();
            break;
            case 40:
                lbl_img.setLocation(lbl_img.getX(), lbl_img.getY()+10);
                lbl_img.setIcon(emoji_down);
                IsIconYAxisOutOfBounds();
            break;
            case 39:
                lbl_img.setLocation(lbl_img.getX()+10, lbl_img.getY());
                lbl_img.setIcon(emoji_right);
                IsIconXAxisOutOfBounds();
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

}