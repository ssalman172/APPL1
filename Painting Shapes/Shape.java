package PaintingShapes;

public abstract class Shape {
	private String shapeName;
	
	abstract void area();
	
	@Override
	public String toString() {
		return "Shape Name : " + shapeName;
	}
}
