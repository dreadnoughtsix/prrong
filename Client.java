/**
 * @since 2016-04-26
 * @version 1.1
 * @author dreadnoughtsix
 */

public class Client {
    public static void main(String[] args) {

        // Screen freezing fix
        if (System.getProperty("os.name").equals("Linux")) {
            System.setProperty("sun.java2d.opengl", "true");
        }

        Game game = new Game();
        game.gameframe.add(game);
    }
}
