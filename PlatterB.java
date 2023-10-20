
package javacomposition;

public class PlatterB {
    
    private Circle holeBasePlatte;
    private Circle hole1;
    private Circle hole2;

    public PlatterB( double radius1, double radius2, double radius3) {
        holeBasePlatte = new Circle(radius1);
        hole1 = new Circle(radius2);
        hole2 = new Circle(radius3);
       
    }

    public double getTotalSolidSurfaceArea() {
        return holeBasePlatte.getCircleArea() - hole1.getCircleArea() - hole2.getCircleArea();
    }
    public double getTotalVacantSurface(){
        return hole1.getCircleArea() + hole2.getCircleArea();
    }

    public double getOuterBoundry() {
        return holeBasePlatte.getCircleCircumference();
    }

    public double getInnerBoundry() {
        return hole1.getCircleCircumference() + hole2.getCircleCircumference();
    }
}


    
