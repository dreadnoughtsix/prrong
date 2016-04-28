/**
 * @since 2016-04-26
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Paddle {

    public static final int WIDTH = 10, HEIGHT = GUI.HEIGHT/15;
    private Rectangle paddle = new Rectangle(WIDTH, HEIGHT);
    int x, y, player;


    public Paddle(int xPos, int yPos, int player_num) {

        this.x = xPos;
        this.y = yPos;
        this.player = player;
    }

    public Rectangle drawPaddle(Graphics g, int yVel) {
        Rectangle r = new Rectangle(this.x, this.y, WIDTH, HEIGHT);
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y + yVel, WIDTH, HEIGHT);

        return r;
    }

}
