package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

     double length;
     double width;

     Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

     double getWidth() {
        return width;
    }

    abstract void setLength(double length);
    abstract void setWidth(double width);
}
