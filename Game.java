/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;

public class Game extends JPanel {

    private static final long serialVersionUID = 1L;

    private Paddle p1, p2;
    private Ball ball;
    public Timer timer;
    private int delay = 1000;

    Game() {
        this.setPreferredSize(GameFrame.gameDim);
        this.setBackground(Color.BLACK);

        p1 = new Paddle(1);
        p2 = new Paddle(2);
        ball = new Ball();

        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("timer works");
            }
        };

        timer = new Timer(delay, taskPerformer);
        timer.start();
    }

    public void paintComponent(Graphics g) {
    }

}
