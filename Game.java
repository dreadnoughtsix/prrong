/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    private boolean running = false;
    private Thread thread;
    public static GameFrame gameframe = new GameFrame();

    Game() {
        setPreferredSize(GameFrame.gameDim);
    }

    // Game loop starts here
    public synchronized void start() {
        running = true;
        thread = new Thread(this, "Game");
        thread.start();
    }
    
    // Stops game loop when necessary
    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Runnable method
    public void run() {
        while (running) {
        }
    }
}
