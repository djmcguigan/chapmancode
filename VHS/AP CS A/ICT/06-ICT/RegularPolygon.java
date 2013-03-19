public class RegularPolygon{

   private int myNumSides;        // # of sides
   private double mySideLength;   // length of side
   private double myR;            // radius of circumscribed circle
   private double myr;            // radius of inscribed circle
    
   public RegularPolygon()
   {
       myNumSides = 3;
       mySideLength = 1;
       myR = 0;
       myr = 0;
   }
   
   public RegularPolygon(int numSides, double sideLength)
   {
       myNumSides = numSides;
       mySideLength = sideLength;
       myR = 0;
       myr = 0;
       calcr();
       calcR();
   }

   private void calcr()
   {
       double r = .5 * mySideLength * 1 / (Math.tan(Math.PI / myNumSides));
       myr += r;
   }
 
   private void calcR()
   {
       double R = .5 * mySideLength * 1 / (Math.sin(Math.PI / myNumSides));
       myR += R;
   }
   
   public double vertexAngle()
   {
       double vertex = ((getNumSides() - 2) / getNumSides()) * 180;
       return vertex;
   }

   public double perimeter()
   {
       double perimeter = myNumSides * mySideLength;
       return perimeter;
   }
   
   public double area()
   {
       double area = .5 * myNumSides * Math.pow(myR,2) * Math.sin((2 * Math.PI) / myNumSides);
       return area;
   }

   public double getNumSides()
   {
       return myNumSides;
   }

   public double getSideLength()
   {
       return mySideLength;
   }
   
   public double getR()
   {
       return myR;
   }
   
   public double getr()
   {
       return myr;
   }
}
