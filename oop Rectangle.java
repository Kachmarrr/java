public class Main {

    public static void main(String[] args) {

        Rectangle example1 = new Rectangle(15, 17);

        int area = example1.getArea();
        int perimeter = example1.getPerimeter();

        System.out.println("Initial Area: " + area);
        System.out.println("Initial Perimeter: " + perimeter);

        example1.setLength(20);
        example1.setWidth(10);

        area = example1.getArea();
        perimeter = example1.getPerimeter();

        System.out.println("Updated Area: " + area);
        System.out.println("Updated Perimeter: " + perimeter);
    }
}

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int deflength, int defwidth) {
        length = deflength;
        width = defwidth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }
}
