class cylinderdemo{
	public static void main(String args[])
	{cylinder c1=new cylinder();
	cylinder c2=new cylinder(3);
	cylinder c3 =new cylinder(2,3);
	cylinder c4= new cylinder(2,4,"green");
	double volume,area;
	area=c1.getArea();
	System.out.print("area is:"+area);
	volume=c1.getvolume();
	System.out.print("volume is:"+volume);
	area=c2.getArea();
	System.out.print("area is:"+area);
	volume=c2.getvolume();
	System.out.print("volume is:"+volume);
	area=c3.getArea();
	System.out.print("area is:"+area);
	volume=c3.getvolume();
	System.out.print("volume is:"+volume);
	area=c4.getArea();
	System.out.print("area is:"+area);
	volume=c4.getvolume();
	System.out.print("volume is:"+volume);}
}