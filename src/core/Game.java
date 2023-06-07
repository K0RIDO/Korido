package core;

import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("MS Gothic", Font.PLAIN, 96);
    Font startButtonFont = new Font("Times New Roman", Font.PLAIN, 32);
    JButton startButton;

    public Game() {

        Image icon = Toolkit.getDefaultToolkit().getImage("assets\\korido.png");

        window = new JFrame();
        window.setTitle("KORIDO");
        window.setIconImage(icon);
        window.setSize(800, 600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("コリドー");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(startButtonFont);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        window.setVisible(true);
    }

    public static void main(String[] args) {

        new Game();
    }
}