/**
 * Created by mb977 on 10/10/16.
 */
public class perfectSquare {

    public int c;

    public perfectSquare(int a) {

    }

    public int perfectRandom() {
        c = (int) (Math.random() * 10 + 1);
        c = c * c;
        return c;
    }
}
