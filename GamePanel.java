/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private Paddle p1, p2;
    private Ball ball;
    public Timer timer;
    private int delay = 1000;

    GamePanel() {
        super();
        this.setPreferredSize(GameFrame.gameDim);
        this.setOpaque(true);
        this.setBackground(Color.BLACK);

        p1 = new Paddle(1);
        p2 = new Paddle(2);
        ball = new Ball();

        GameController gc = new GameController();
        addKeyListener(gc);
        setFocusable(true);


        timer = new Timer(delay, gc);
        timer.start();
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        p1.drawPaddle(g);
        p2.drawPaddle(g);
        ball.drawBall(g);
    }

}
