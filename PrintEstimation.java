
package javacomposition;
/*
@author Deepak Dangi
 */
public class PrintEstimation {

    public static void printpallater(Platter platter) {

        System.out.println("Platter Outer Boundarie is = " + platter.getOuterBoundry());
        System.out.println("Platter Total Area is = " + platter.getTotalVacantSurface());
        System.out.println("Platter inner Boundaries is = " + platter.getInnerBoundry());
        System.out.println("Platter Solid surface is = " + platter.getTotalSolidSurfaceArea());

        System.out.println("-----------------**-------------------**--------------**-------------------");

    }

    public static void printpallaterA(PlatterA platterA) {
        System.out.println("PlatterA Total Solid Surface Area: " + platterA.getTotalSolidSurfaceArea());
        System.out.println("PlatterA Total Vacant Surface: " + platterA.getTotalVacantSurface());
        System.out.println("PlatterA Outer Boundary: " + platterA.getOuterBoundry());
        System.out.println("PlatterA Inner Boundary: " + platterA.getInnerBoundry());

        System.out.println("--------------**-----------------------**------------------------**-------------");

    }

    public static void printpallaterB(PlatterB platterB) {
        System.out.println("PlatterB Total Solid Surface Area: " + platterB.getTotalSolidSurfaceArea());
        System.out.println("PlatterB Total Vacant Surface: " + platterB.getTotalVacantSurface());
        System.out.println("PlatterB Outer Boundary: " + platterB.getOuterBoundry());
        System.out.println("PlatterB Inner Boundary: " + platterB.getInnerBoundry());

        System.out.println("--------------**-----------------------**------------------------**-------------");

    }

    public static void printpallaterC(PlatterC platterC) {
        // Calculate and print the properties of the platter
        System.out.println("Platterc Total Solid Surface Area: " + platterC.getTotalSolidSurfaceArea());
        System.out.println("Platterc Total Vacant Surface: " + platterC.getTotalVacantSurface());
        System.out.println("Platterc Outer Boundary: " + platterC.getOuterBoundry());
        System.out.println("Platterc Inner Boundary: " + platterC.getInnerBoundry());

    }
}
