
package javacomposition;

public class Square {
   
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSquareArea() {
        return side * side;
    }

    public double getSquarePerimeter() {
        return 4 * side;
    }

}

    

