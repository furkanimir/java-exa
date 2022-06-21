import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) throws FileNotFoundException {

		// create a new File object and give Scanner object this file object as the
		// input stream
		Scanner input = new Scanner(new File("point-data.txt"));

		// read the number of points in the file
		int nPoints = Integer.valueOf(input.nextLine());


		// create arrays to store x and y coordinates and colors
		// TO-DO
		
		
		double[] x = new double[nPoints];
		
		double[] y = new double[nPoints];
		
		String[] colors = new String[nPoints];
		

		// read the points data line by line
		for (int i = 0; i < nPoints; i++) {
			x[i]=input.nextDouble();
			y[i]=input.nextDouble();
			colors[i]=input.next();
			
			// check if there is a line to read
			
			if (input.hasNextLine()) {
				String line = input.nextLine();
				
				// TO-DO: process your line here
				// store the data in your array			"burasý kafa karýþtýrýcý
			} // end if
			

			
		} // end for

		// TO-DO: compute the maximum and minimum distance between points, display it on
		// console
		double maxDistance = 0;
		double minDistance = Double.MAX_VALUE;
		double dis=0;
		
		
		for(int j=0;j<nPoints;j++) {
			for (int p=j+1;p<nPoints;p++) {
				
				dis=Math.sqrt((Math.pow((x[j]-x[p]), 2) + Math.pow((y[j]-y[p]), 2)));
				if(dis>maxDistance)
					maxDistance=dis;
				if(dis<minDistance)
					minDistance=dis;
			
			}
		}
		
		System.out.println("The maximum distance between two points is " + maxDistance);
		System.out.println("The minimum distance between two points is " + minDistance);

		// TO-DO: find the northmost, eastmost, southmost, westmost points, display it on console
		double northX = 0, eastX = 0, southX = 0, westX =Double.MAX_VALUE;
		double northY = 0, eastY = 0, southY = Double.MAX_VALUE, westY = 0; 
		String northC="null", eastC="null", southC="null", westC="null";
		
		
		for(int i=0;i<nPoints;i++) {
			if(y[i]>northY) {
				northX=x[i];
				northY=y[i];
				northC=colors[i];
			}
			if(y[i]<southY) {
				southX=x[i];
				southY=y[i];
				southC=colors[i];
			}
			if(x[i]<westX) {
				westX=x[i];
				westY=y[i];
				westC=colors[i];
			}
			if(x[i]>eastX) {
				eastX=x[i];
				eastY=y[i];
				eastC=colors[i];
			}					
		}
		
		
		/*
		 * Hocam istediðiniz þeyin bu olmadýðýný adým gibi biliyorum ama baþka türlü yapamadým malesef*
		*/
	
		
		System.out.println("The northmost point is the " + northC +" point with coordinates ("+northX+" , "+northY+ ")" );
		System.out.println("The southmost point is the " + southC +" point with coordinates ("+southX+" , "+southY+ ")" );
		System.out.println("The eastmost point is the " + eastC +" point with coordinates ("+eastX+" , "+eastY+ ")"  );
		System.out.println("The westmost point is the " + westC +" point with coordinates ("+westX+" , "+westY+ ")" );
		
		
		
		/*System.out.println("The northmost point is " + points[north].toString());
		System.out.println("The southmost point is " + points[south].toString());
		System.out.println("The eastmost point is " + points[east].toString());
		System.out.println("The westmost point is " + points[west].toString());
		*/

		
	}
	
	
	
}
