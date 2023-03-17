package OOP_Abstract;

public abstract class Rectangle extends Shape{
	private double width;
	private double length;
	public Rectangle() {
		super();
		this.width = 1;
		this.length = 1;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width * length;
	}
	public double getPerimeter() {
		return (width + length) * 2;
	}
	@Override
	public String toString() {
		return String.format("Rectangle[%s, width=%f,length=%f]", super.toString(),width,length);
	}
}