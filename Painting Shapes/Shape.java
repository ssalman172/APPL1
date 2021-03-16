package PaintingShapes;

public abstract class Shape {
	private String shapeName;
	
	abstract double area();
	
	@Override
	public String toString() {
		return "Shape Name : " + shapeName;
	}
}
