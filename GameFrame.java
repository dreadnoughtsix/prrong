/**
 * @since 2016-04-23
 * @version 1.1
 * @author dreadnoughtsix
 */

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Toolkit;

public class GameFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    public static final Toolkit tk = Toolkit.getDefaultToolkit();
    public static final Dimension screenDim = tk.getScreenSize();

    public static final int WIDTH = (int) screenDim.getWidth() - 300;
    public static final int HEIGHT = (int) screenDim.getHeight() - 200;
    public static final Dimension gameDim = new Dimension(WIDTH, HEIGHT);

    GameFrame() {
        // Create main frame
        setTitle("PRRONG");
        setPreferredSize(gameDim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();

        setLocation((screenDim.width - gameDim.width)/2,
                (screenDim.height - gameDim.height)/2);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
    }
}
