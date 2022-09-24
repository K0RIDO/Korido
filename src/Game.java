import javax.swing.*;
import java.awt.*;

public class Game {

    JFrame window;
    Container con;

    public Game() {

        window = new JFrame();
        window.setTitle("KORIDO");
        window.setSize(800, 600);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
    }

    public static void main(String[] args) {

        new Game();
    }


}