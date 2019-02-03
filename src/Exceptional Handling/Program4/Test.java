class Test
{
	public void display()
	{
    System.out.print("the program is executed");
	}
}

class TestDemo
{
	public static void main(String args[])
	{
	Test s=null;
	try{
	s.display();
	}
	catch(Exception e)
	{
	System.out.print(e);
	}
	
	}
}