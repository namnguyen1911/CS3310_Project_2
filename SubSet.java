public class SubSet {
    private int top, height;

    SubSet() {
        top = 0;
        height = 0;
    }

    SubSet(int newTop, int newHeight) {
        top = newTop;
        height = newHeight;
    }

    public void setTop(int newTop) {
        top = newTop;
    }

    public void setHeigh(int newHeight) {
        height = newHeight;
    }

    public int getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }
}
