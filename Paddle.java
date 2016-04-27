/**
 * @since 2016-04-26
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;

public class Paddle {

    public static final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = GUI.HEIGHT/12;
    private Rectangle paddle = new Rectangle(PADDLE_WIDTH, PADDLE_HEIGHT);
    int x, y;

    public Paddle(int xPos, int yPos) {

        x = xPos;
        y = yPos;
    }

    public void drawPaddle(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
    }
}
