/**
 * @since 2016-04-23
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JFrame;

public class GUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private final int WIDTH = 1200, HEIGHT = 700;

    GUI() {
        setTitle("PONG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
    }
}
