public class rectangle
{
	private double length;
	private double width;
	double area,perimeter;
	public rectangle()
	{
		length=10;
		width=10;
	}
	public rectangle(double l,double w)
	{
		length=l;
		width=w;
	}

	public void setDimension(double a,double b)
	{
		length=a;
		width=b;

	}

	public double getlength()
	{
		return length;
	}

	public double getwidth()
	{
		return width;
	}

	public double area()
	{
		area=length*width;
		System.out.print("areais:"+area);
		return area;
	}
	public double perimeter()
	{
      perimeter=length+width;
      System.out.print("areais:"+area);

      return perimeter;
	}
	public void print()
	{
		System.out.println("The area is "+area);
		System.out.println("The perimeter is "+perimeter);
	}


}