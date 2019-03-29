package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


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
}
