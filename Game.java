/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Game extends Canvas implements Runnable{

    private static final long serialVersionUID = 1L;
    public static final Toolkit tk = Toolkit.getDefaultToolkit();
    public static final Dimension screenDim = tk.getScreenSize();

    private boolean running = false;
    private Thread thread;
    public static GameFrame gameframe = new GameFrame();


    public synchronized void start() {
        running = true;
        thread = new Thread(this, "Game");
        thread.start();
    }
    
    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (running) {
            System.out.println("Running...");
        }
    }


}
