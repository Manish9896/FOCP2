class Box
{
	double width,w;
    double height,h;
    double depth,d;

    void setDim()
    {
    	w=width;
    	h=height;
    	d=depth;
    }

    double volume()
    {
    	return w*h*d;
    }
}


class BoxDemo
{
	public static void main(String args[])
	{
		double vol;
		Box b1 = new Box();
		b1.width=2;
		b1.height=5;
		b1.depth=10;
		b1.setDim();
		vol=b1.volume();
		System.out.print("The volume is "+vol);
	}
}