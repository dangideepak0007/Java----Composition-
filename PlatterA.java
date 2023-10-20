package javacomposition;

public class PlatterA {
    private Rectangle basePlate;
    private Circle hole1;
    private Circle hole2;
    private Square square1;
    private Square square2;
    private Square square3;
    private Square square4;
    public PlatterA(double length, double breadth, double radius1, double radius2 ,double side1,double side2,double side3 , double side4) {
        basePlate = new Rectangle(length, breadth);
        hole1 = new Circle(radius1);
        hole2 = new Circle(radius2);
        square1 = new Square(side1);
        square2 = new Square(side2);
        square3 = new Square(side3);
        square4 = new Square(side4);
        
    }

    public double getTotalSolidSurfaceArea() {
        return basePlate.getRectangleArea() - hole1.getCircleArea() - hole2.getCircleArea() - square1.getSquareArea() - square2.getSquareArea() - square3.getSquareArea() - square4.getSquareArea();
    }

    public double getTotalVacantSurface() {
        return hole1.getCircleArea() + hole2.getCircleArea() + square1.getSquareArea() + square2.getSquareArea() + square3.getSquareArea() + square4.getSquareArea();
    }

    public double getOuterBoundry() {
        return basePlate.getRectanglePerimeter();
    }

    public double getInnerBoundry() {
        return hole2.getCircleCircumference() + hole1.getCircleCircumference() + square1.getSquarePerimeter() + square2.getSquarePerimeter() + square3.getSquarePerimeter() + square4.getSquarePerimeter();
    }
}
    
 
    