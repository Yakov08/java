package zadania1and2;
import java.math.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = false;
        this.color = "blue";
        width=1;
        length=2;
    }
    public Rectangle(double width, double length ){
    this.filled=false;
    this.color="blue";
    this.length=length;
    this.width=width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength(){

        return length;
    }
    public void setLength(double length) {

        this.length = length;
    }
    public  double getArea() {
        return width*length;
    }
    public  double getPerimeter(){
        return (2*width)+(2*length);
    }
    public String toString(){
        return "Shape: rectangle's parameters are width " + this.width + ", length " + this.length + ", color " + this.color + "is filled " + this.filled ;
    }
}
