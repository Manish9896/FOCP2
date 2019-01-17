class Box{
	double width;
	double height;
	double depth;

	Box() {
		System.out.println("constructing box");
		width = 10;
		height = 10;
		depth = 10;

	}
	Box(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width*height*depth;
	}

  
}

class BoxDemo1{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box(3,6,9);
		double vol;
		vol = mybox1.volume();
		System.out.println("volume is "+vol);
		vol =mybox2.volume();
		System.out.println("Volume is "+vol);
	}
}
