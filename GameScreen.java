import javax.swing.*;
import java.awt.*;


class GameScreen {
    // Run the application from here
   public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setBounds(10,10,1000,600);
        jframe.setBackground(new Color(0XB2A4FF));
        jframe.setTitle("LUDO");
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameMoves gm = new GameMoves();
        gm.setFocusable(true);
        gm.addKeyListener(gm);
        gm.addMouseListener(gm);
        jframe.add(gm);
        jframe.setVisible(true);
   }
}