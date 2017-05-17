package controle.legacy;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Rectangle extends Shape {
    private LegacyRectangle lr;

    public Rectangle() {
        this.lr = new LegacyRectangle();
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        lr.draw(x, y, w, h);
    }
}
