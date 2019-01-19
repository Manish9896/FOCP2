class CircleStatic {
	private double radius;
    private static int numberOfObjects = 0;
	public void setradius(double a)
	{
		radius=a;
		numberOfObjects++;

	}

	public double getradius(){
		return radius;
	}

	public static int getnumberOfObjects()
	{
		return numberOfObjects;
	}

	public void findarea()
	{
		double area;
		area=3.14*radius*radius;
		System.out.print("The area is:"+area);
	}

}


public class TestCircleStatic
{

	public static void main(String[] args){
		CircleStatic circle1 = new CircleStatic();
		System.out.print("Circle 1 information");
		circle1.setradius(5);
		System.out.print("Circle 1 radius:"+circle1.getradius());
		System.out.println("The number of circle objetcs:" +CircleStatic.getnumberOfObjects());
		CircleStatic circle2 = new CircleStatic();
		circle1.findarea();
		circle2.setradius(5);
		System.out.print("Circle 2 radius:"+circle2.getradius());
		System.out.println("The number of Circle objects:" +CircleStatic.getnumberOfObjects());
		circle2.findarea();
	}
}