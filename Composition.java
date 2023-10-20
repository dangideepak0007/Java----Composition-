package javacomposition;

/*
@author Deepak Dangi
 */
public class Composition {

    public static void main(String[] args) {
        
        Platter p = new Platter(10,8,2,2);
        PrintEstimation.printpallater(p);
                                                                         
        // PlatterA object 
        PlatterA myPlatterA = new PlatterA(10, 8, 2, 1.5,3,4,3,4);
        PrintEstimation.printpallaterA(myPlatterA);
        
        // PlatterB object 
        PlatterB myPlatterB = new PlatterB(10.0, 8.0, 5.0);
        PrintEstimation.printpallaterB(myPlatterB);
               
        // PlatterC object 
        PlatterC myPlatterC = new PlatterC(10.0, 8.0, 2.0, 1.5, 1.0);
        PrintEstimation.printpallaterC(myPlatterC);
        
    }
}
