/**
 * @since 2016-05-04
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class GameController implements ActionListener, KeyListener {

    public int x, y;
    
    GameController(int xPos, int yPos) {
        this.x = xPos;
        this.y = yPos;
    }

    public void setX(int x) {}
    public void setY(int x) {}
    public void actionPerformed(ActionEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
