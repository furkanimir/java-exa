import java.text.DecimalFormat;
import java.math.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fati {

   public static void main(String[] args) throws FileNotFoundException {
      
      // create a new File object and give Scanner object this file object as the input stream
      Scanner input = new Scanner(new File("points-data.txt"));
      
      // read the number of points in the file
      int nPoints = input.nextInt();
      
      // create arrays to store x and y coordinates and colors 
      double[] x = new double[nPoints];  // TO-DO: create your arrays
      double[] y = new double[nPoints];     // TO-DO: create your arrays
      String[] color = new String[nPoints]; ;    // TO-DO: create your arrays
      // read the points data line by line
      for (int i = 0; i < nPoints; i++) {
         
         // check if there is a line to read
         if (input.hasNextLine()) {
            
            String line = input.nextLine();
            x[i] = input.nextDouble();
            y[i] = input.nextDouble();
            color[i] = input.next();
            // TO-DO: process your line here
            // store the data in your arrays

         } // end if
         
      } // end for
      
         
      // TO-DO: compute the maximum and minimum distance between points, display it on console
      double maxDistance = 0;
      double minDistance = Double.MAX_VALUE;
      
      for(int i = 0; i<nPoints; i++) {
         for(int j = i+1; j<nPoints && i!=j; j++) {
            
            double distance1 =distance(x[i],y[i],x[j],y[j]); 
            
            if(minDistance > distance1)
               minDistance = distance1;
            
            if(maxDistance < distance1)
               maxDistance = distance1;

         }
      }
      DecimalFormat df = new DecimalFormat("0.00");
      String formate = df.format(maxDistance);
      System.out.println("The maximum distance between two points is "+ formate);
      formate = df.format(minDistance);
      System.out.println("The minimum distance between two points is "+ formate);
      
      
      
      // TO-DO: find the northmost, eastmost, southmost, westmost points, display it on console
      double northmostX=0, northmostY = 0;
      double eastmostX=0, eastmostY=0;
      double southmostX=0, southmostY = Double.MAX_VALUE;
      double westmostX = Double.MAX_VALUE, westmostY=0;
      String northColor = "";
      String eastColor = "";
      String southColor = "";
      String westColor = "";
      
      for(int i = 0; i<nPoints; i++) {
         if(northmostY < y[i]) {
            northmostY = y[i];
            northmostX = x[i];
            northColor = color[i];
         }
         if(southmostY > y[i]) {
            southmostY = y[i];
            southmostX = x[i];
            southColor = color[i];
         }
         if(eastmostX < x[i]) {
            eastmostY = y[i];
            eastmostX = x[i];
            eastColor = color[i];
         }
         if(westmostX > x[i]) {
            westmostY = y[i];
            westmostX = x[i];
            westColor = color[i];
         }
      }
      System.out.println("The northmost point is the "+northColor+"point with coordinates ("+ northmostX+","+northmostY+")");
      System.out.println("The eastmost point is the "+eastColor+"point with coordinates ("+ eastmostX+","+eastmostY+")");
      System.out.println("The northmost point is the "+northColor+"point with coordinates ("+ southmostX+","+southmostY+")");
      System.out.println("The northmost point is the "+northColor+"point with coordinates ("+ westmostX+","+westmostY+")");
      
   }
   public static double distance(double x1,double y1,double x2,double y2) {
      return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
   }
}
///////////////////////////////