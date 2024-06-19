package comp1110.lab2;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 26/2/2024 12:30 pm
 */
public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(int v) {
        this.x = v;
        this.y = v;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {

        //returns the string (1, 3) when x and y are 1 and 3
        Coordinate coordinate = new Coordinate(1, 3);
        System.out.println(coordinate);
    }
}
