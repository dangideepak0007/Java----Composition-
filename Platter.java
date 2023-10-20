package javacomposition;/*
 * @author Deepak Dangi
 */
public class Platter {

    private Rectangle BasePlatter;
    private Circle hole1;
    private Circle hole2;

    public Platter(double length, double breadth, double radius1, double radius2) {
        BasePlatter = new Rectangle(length, breadth);
        hole1 = new Circle(radius1);
        hole2 = new Circle(radius2);
    }

    public double getTotalSolidSurfaceArea() {
        return BasePlatter.getRectangleArea() - (hole1.getCircleArea() + hole2.getCircleArea());
    }

    public double getTotalVacantSurface() {
        return hole1.getCircleArea() + hole2.getCircleArea();
    }

    public double getOuterBoundry() {
        return BasePlatter.getRectanglePerimeter();
    }

    public double getInnerBoundry() {
        return hole1.getCircleCircumference() + hole2.getCircleCircumference();
    }
}
