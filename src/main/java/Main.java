import view.GamePanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boat duel");
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new GamePanel());
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
