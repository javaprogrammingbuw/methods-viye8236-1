
// public class Circle {
// 	//todo: add some methods to compute a circle's diameter, circumference and area.
// 	//print some outputs to confirm your methods are working correctly.
// }


import java.lang.Math;
import java.util.*;

public class Circle {
	public static void main(String[] args) {
		
	Scanner	scanner = new Scanner(System.in);
	
	double radius = 0.0;
	
		System.out.println("Enter the radius");
		
		radius = scanner.nextDouble();
		 System.out.println(" Enter the radius required" +radius);
		 	
		  double area = Math.PI* radius* radius;
		  System.out.println("Area of the circle" +area);
		  
		  double circumference = 2*Math.PI*radius;
		  System.out.println("Circumference of the circle"+ circumference);
		  
			  
		
		
	}
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.

}



