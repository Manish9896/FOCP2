public class Date2
{
	int date;
	int month;
	int year;

	Date2()
	{
		month=1;
		date=1;
		year=2000;
	}

	Date2(int month,int date,int year)
	{
		this.month=month;
		this.date=date;
		this.year=year;
	}

	void Display()
	{
		System.out.print("The Date is"+month+"/"+date+"/"+year);
	}
}
