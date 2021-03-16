package PaintingShapes;

public class Cylinder extends Shape  {  
	private double radius; 
	private double height;
	
	public Cylinder(double r, double h)  {  
		super("Cylinder");  
		radius = r;  
		height = h;
	}  
	
	public double area()  {  
		return Math.pow(Math.PI*radius, 2)*height;  
	} 

	public String toString()  {  
		return super.toString() + "\nRadius : " + radius + "\nHeight : " + height;   
	}  
}  