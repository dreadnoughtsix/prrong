/**
 * @since 2016-04-23
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

    private static final long serialVersionUID = 1L;
    public static Toolkit tk = Toolkit.getDefaultToolkit();
    public static Dimension d = tk.getScreenSize();
    public static int width = (int) d.getWidth();
    public static int height = (int) d.getHeight();
    public static final int WIDTH = width - 400, HEIGHT = height - 200;


    Paddle playerOne = new Paddle(5, 10);
    Paddle playerTwo = new Paddle(WIDTH - (Paddle.PADDLE_WIDTH + 5), 10);

    GUI() {
        this.setTitle("PONG");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(width - 400, height - 200);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        playerOne.drawPaddle(g);
        playerTwo.drawPaddle(g);
    }

}
