/**
 * @since 2016-05-04
 * @version 1.1
 * @author dreadnoughtsix
 */

public abstract class GameObject {

    public int x, y, id;

    public GameObject() {
        this.x = this.y = 0;
    }

    GameObject(int id) {
        this.id = id;
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
