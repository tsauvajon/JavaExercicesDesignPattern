package controle.legacy;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Line extends Shape {
    private LegacyLine ll;

    public Line() {
        this.ll = new LegacyLine();
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        ll.draw(x, y, w, h);
    }
}
