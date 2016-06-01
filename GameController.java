/**
 * @since 2016-05-04
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class GameController implements KeyListener {

    private boolean[] keys = new boolean[120];
    public boolean up, down, w, s;
    public int x, y;
    
    public void update() {
        up = keys[KeyEvent.VK_UP];
        down = keys[KeyEvent.VK_DOWN];
        w = keys[KeyEvent.VK_W];
        s = keys[KeyEvent.VK_S];
    } 

    public void setX(int newX) {
        this.x = newX;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public int getY() {
        return this.y;
    }
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
    public void keyTyped(KeyEvent e) {}
}
