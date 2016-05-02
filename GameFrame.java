/**
 * @since 2016-04-23
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public static final Toolkit tk = Toolkit.getDefaultToolkit();
    public static final Dimension screenDim = tk.getScreenSize();

    private static final int WIDTH = (int) screenDim.getWidth() - 300;
    private static final int HEIGHT = (int) screenDim.getHeight() - 200;
    private static final Dimension gameDim = new Dimension(WIDTH, HEIGHT);

    GameFrame() {
        // Create main frame
        this.setTitle("PONG");
        this.setPreferredSize(gameDim);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();

        this.setLocation((screenDim.width - gameDim.width)/2,
                (screenDim.height - gameDim.height)/2);
        this.setVisible(true);
    }
}
