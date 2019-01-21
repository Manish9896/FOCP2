class circle
{
	private double radius;
	double area;
	public void setRadius(double radius)
	{
      this.radius=radius;
	}

	public double getRadius()
	{
		return radius;
	}

	public void findArea()
	{
		 area=3.14*radius*radius;
	}
	public void displayArea()
	{
      System.out.println("The area of given circle is "+area);
	}

}

class circledemo2
{
	public static void main(String args[])
	{
		circle c = new circle();
		c.setRadius(2);
		c.getRadius();
		c.findArea();
		c.displayArea();
	}
}