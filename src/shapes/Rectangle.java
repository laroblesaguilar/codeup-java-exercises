package shapes;

public class Rectangle extends Quadrilateral{


    public Rectangle(double length, double width){
        super(length, width);
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width){
        this.width = width;
    }


    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,4);
        System.out.println(r1.getWidth());

        r1.setLength(80);
        System.out.println(r1.getLength());

        System.out.println(r1.toString());
    }
}
