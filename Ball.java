/**
 * @since 2016-05-04
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ball extends GameObject {

    public int x, y;
    private Dimension ballDim = new Dimension(15, 15);
    public Timer timer;

    Ball() {
        this.x = (GameFrame.WIDTH / 2) - ballDim.width;
        this.y = (GameFrame.HEIGHT /2) - ballDim.height;
    }

    public void drawBall(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, ballDim.width, ballDim.height);
    }


}
