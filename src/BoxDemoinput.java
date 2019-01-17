import java.util.*;
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


class BoxDemoinput
{
	public static void main(String args[])
	{
		double vol;
		Scanner input = new Scanner(System.in);
		Box b1 = new Box();
		b1.width=input.nextInt();
		b1.height=input.nextInt();
		b1.depth=input.nextInt();
		b1.setDim();
		vol=b1.volume();
		System.out.print("The volume is "+vol);
	}
}