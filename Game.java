/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import javax.swing.JPanel;
import java.awt.Color;

public class Game extends JPanel {

    private static final long serialVersionUID = 1L;

    public GameFrame gameframe = new GameFrame();

    private Paddle p1, p2;
    private Ball ball;

    Game() {
        this.setPreferredSize(GameFrame.gameDim);

        p1 = new Paddle(1);
        p2 = new Paddle(2);
        ball = new Ball();
    }

}
