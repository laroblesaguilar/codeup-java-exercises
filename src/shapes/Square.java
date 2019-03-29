package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side); //constructs with parent constructor;
        this.side = side;
    }

    public double getArea(){
        return Math.pow(side,2);
    }

    public double getPerimeter(){
        return 4 * side;
    }

    public void setLength(double side){
        this.side = side;
    }

    public void setWidth(double side){
        this.side = side;
    }

}
