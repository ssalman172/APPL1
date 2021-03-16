package PaintingShapes;

public class Cylinder extends Shape  {  
	private double radius; 
	private double height;
	public Cylinder(double r, double h)  {  
		super("Cylinder");  
		radius = r;  
		height = h;
	}  
	//-----------------------------------------  
	// Returns the surface area of the sphere.  
	//-----------------------------------------  
	public double area()  {  
		return Math.pow(Math.PI*radius, 2)*height;  
	} 
	//-----------------------------------  
	//Returns the sphere as a String.  
	//-----------------------------------  
	public String toString()  {  
		return super.toString() + " of radius " + radius + " and height " + height;   
	}  
}  