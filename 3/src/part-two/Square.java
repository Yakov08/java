package zadania1and2;

public class Square extends Rectangle {
    protected double side;
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide() {
        return super.getWidth();
    }
    public void setSide( double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public  void setWidth(double side){
        this.side=side;
    }
    public  void setLength(double side){
        this.side=side;
    }
    @Override
    public String toString() {
        return "Shape: square's parameters are side " + this.width + ", color " + color + ", is filled " + filled;
    }

}
