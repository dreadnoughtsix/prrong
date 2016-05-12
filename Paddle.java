/**
 * @since 2016-04-26
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.Graphics;
import java.awt.Color;

public class Paddle extends GameObject { 
    
    public final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = GameFrame.HEIGHT/10;
    private int x, y, player;
    
    Paddle(int id) {

        this.player = id;

        if (this.player == 1) {
            this.x = 0;
        } else if (this.player == 2) {
            this.x = GameFrame.WIDTH - PADDLE_WIDTH;
        }

        this.y = 0;
    }

    public void drawPaddle(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, PADDLE_WIDTH, PADDLE_HEIGHT);
    }
}
