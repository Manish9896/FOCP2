class Triangle extends Shape
{
	Triangle(double dim1,double dim2)
	{
		super(dim1,dim2);
	}

	public double area()
	{
      double area;
      area = 0.5*a*b;
      return area;
	}

	void display_area()
	{
		System.out.println("The area is "+area());
	}
}