class Test{
public void display()
{System.out.println("test is diplayed");}

}
class Testdemo
{public static void main(String args[])
{ Test t=null;
try{
	t.display();
}
catch(Exception e)
{
	System.out.println(e);
}}}