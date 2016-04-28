/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameBoard extends JPanel implements ActionListener, KeyListener {

    private static final long serialVersionUID = 1L;
    int p1x = 5, p2x = GUI.WIDTH - (Paddle.WIDTH + 5), p1y = 10, p2y = 10;
    public int p1yVel = 0, p2yVel = 0;
    public Graphics g;

    Timer t = new Timer(1, this);
    GameBoard(){
        t.start();
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(p1x, p1y, Paddle.WIDTH, Paddle.HEIGHT);
        g.fillRect(p2x, p2y, Paddle.WIDTH, Paddle.HEIGHT);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (p1y < 0) {
            p1y = 0;
        }
        if (p1y > (GUI.HEIGHT - Paddle.HEIGHT)) {
            p1y = (GUI.HEIGHT - Paddle.HEIGHT);
        }
        if (p2y < 0) {
            p2y = 0;
        }
        if (p2y > (GUI.HEIGHT - Paddle.HEIGHT)) {
            p2y = (GUI.HEIGHT - Paddle.HEIGHT);
        }
        repaint();
        p1y += p1yVel;
        p2y += p2yVel;
    }

    public void keyPressed(KeyEvent e) {
        p1yVel = 1;
        p2yVel = 1;
        System.out.println("Keys work");

        if (e.getKeyCode() == KeyEvent.VK_W) {
            p1yVel = -p1yVel;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            p1yVel = p1yVel;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            p2yVel = -p2yVel;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            p2yVel = p2yVel;
        }
    } 

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {
        p2yVel = 0;
        p1yVel = 0;
    }

}
