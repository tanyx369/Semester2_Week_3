public class Triangle extends GeometricObject
{
	
	private double side_1 = 1.0;
	private double side_2 = 1.0;
	private double side_3 = 1.0;
	
	private double area;
	private double perimeter;
	
	
	// Heron's Formula
	public Triangle() {
		Build();
	}
    
	public Triangle(String color, boolean filled ,double side1 , double side2 , double side3) {
		super(color , filled);
		this.side_1 = side1;
		this.side_2 = side2;
		this.side_3 = side3;
		Build();
	}
	
	private void Build() {
		
		perimeter = side_1 + side_2 + side_3;
		double p = perimeter / 2;
		area = Math.pow((p*(p-side_1)*(p-side_2)*(p-side_3)), 0.5);
	}

	public double getSide1() {
		return side_1;
	}
	
	public double getSide2() {
		return side_2;
	}
	
	public double getSide3() {
		return side_3;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public String toString() {
		String area = String.format("%.2f",  getArea());
		String detail = "Side 1: " + getSide1() + "\n" + "Side 2: " + getSide2() + "\n" + "Side 3: " + getSide3() + "\n" + "Perimeter: " + getPerimeter() +  "\n" + "Area: " + area ;
		return detail;
	}
	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		System.out.println("Default Triangle: ");
		System.out.println(t1);
		System.out.println();
		Triangle t2 = new Triangle("Yellow" , true ,2 , 3, 4);
		System.out.println("T2 Triangle: ");
		System.out.println(t2);
	}
	
}
