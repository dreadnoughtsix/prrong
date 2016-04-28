/**
 * @since 2016-04-23
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

    private static final long serialVersionUID = 1L;
    
    public static final Toolkit tk = Toolkit.getDefaultToolkit();
    public static final Dimension screenDim = tk.getScreenSize();
    private static final int width = (int) screenDim.getWidth();
    private static final int height = (int) screenDim.getHeight();

    public static final int WIDTH = width - 400, HEIGHT = height - 200;
    public static final Dimension gameDim = new Dimension(WIDTH, HEIGHT);

    protected int padWidth = Paddle.WIDTH;
    protected int padHeight = Paddle.HEIGHT;

    GameBoard gameBoard = new GameBoard();

    GUI() {
        // Create main frame
        this.setTitle("PONG");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setPreferredSize(gameDim);
        this.pack();
        this.setLocation((screenDim.width-gameDim.width)/2, 
                (screenDim.height-gameDim.height)/2);
        this.setVisible(true);

        this.add(gameBoard);
    }
}
