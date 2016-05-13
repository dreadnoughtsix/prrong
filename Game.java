/**
 * @since 2016-04-27
 * @version 1.1
 * @author dreadnoughtsix
 */

import java.awt.Canvas;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    private boolean running = false;
    private Thread thread;
    public GameFrame gameframe = new GameFrame();

    private Paddle p1, p2;
    private Ball ball;

    Game() {
        setPreferredSize(GameFrame.gameDim);

        p1 = new Paddle(1);
        p2 = new Paddle(2);
        ball = new Ball();
    }

    // Game loop starts here
    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this, "Game");
        thread.start();
    }
    
    // Stops game loop when necessary
    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }

    // Runnable method
    public void run() {
        while (running) {
            tick();
            render();
        }
    }

    public void tick() {
    
    }

    public void render() {
        // Get the buffer strategy of current canvas
        BufferStrategy bs = getBufferStrategy();

        // if the buffer strategy has not been created, create a new one
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
    
    }
}
