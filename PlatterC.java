
package javacomposition;

public class PlatterC {
    private Rectangle basePlate;
    private Circle hole1;
    private Circle hole2;
    private Circle hole3;

    public PlatterC(double length, double breadth, double radius1, double radius2, double radius3) {
        basePlate = new Rectangle(length, breadth);
        hole1 = new Circle(radius1);
        hole2 = new Circle(radius2);
        hole3 = new Circle(radius3);
    }

    public double getTotalSolidSurfaceArea() {
        return basePlate.getRectangleArea() - hole1.getCircleArea() - hole2.getCircleArea() - hole3.getCircleArea();
    }

    public double getTotalVacantSurface() {
        return hole1.getCircleArea() + hole2.getCircleArea() + hole3.getCircleArea();
    }

    public double getOuterBoundry() {
        return basePlate.getRectanglePerimeter();
    }

    public double getInnerBoundry() {
        return hole1.getCircleCircumference() + hole2.getCircleCircumference() + hole3.getCircleCircumference();
    }
}
