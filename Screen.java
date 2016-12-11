/**
 * @since 2016-06-25
 * @version 1.1
 * @author dreadnoughtsix
 */

public class Screen {
    
    Screen() {
        GameFrame gameFrame = new GameFrame();
        GamePanel gamePanel = new GamePanel();
        gameFrame.pack();
        gameFrame.add(gamePanel);
    }
}
