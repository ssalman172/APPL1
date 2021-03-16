package PaintingShapes;

public class Rectangle extends Shape  {  
	private double length; 
	private double width;
	
	public Rectangle(double panjang, double lebar)  {  
		super("Rectangle");  
		length = panjang;
		width = lebar;
	}  
	
	public double area()  {  
		return length*width;  
	} 

	public String toString()  {  
		return super.toString() + " of length " + length + " and width " + width;
	}  
}  