class Triangle1 extends Shape{
	double base, height;

	Triangle1(double base, double height){
		super();
		this.base = base;
		this.height = height;
	}
	public void getArea(){
		
		area = 0.5*base*height;
		System.out.println("Area of Triangle1 : " +area);
	}
	
}