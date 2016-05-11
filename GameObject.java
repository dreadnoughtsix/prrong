/**
 * @since 2016-05-04
 * @version 1.1
 * @author dreadnoughtsix
 */

public class GameObject {

    public int x, y;

    GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
}
