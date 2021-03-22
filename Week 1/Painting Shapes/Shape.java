package PaintingShapes;

public abstract class Shape {
	private String shapeName;
	
	public abstract double area();
	
	public Shape (String shapeName) {
		this.shapeName = shapeName;
	}
	
	@Override
	public String toString() {
		return shapeName;
	}
}
