import java.util.*;
class array1 {
	public static void main(String args[]){
		int x[];
		x = new int[10];
        int i,count=0;
        Scanner no = new Scanner(System.in);

        System.out.println("Enter the array you want to check");
        for(i=0;i<10;i++)
        {
        	x[i] = no.nextInt();
        }
        System.out.println("Display array");
        for(i=0;i<10;i++)
        {
        	System.out.println(x[i]);
        }
        System.out.println("Enter the number you want to check");
        int y = no.nextInt();
        for(i=0;i<10;i++)
        	{
        		if(x[i]==y)
        		{
        			System.out.println(y+ " is at position "+i);
        			count=count+1;
        		} 
        	
        	}
        	switch(count)
        	{
        		case 1:
        		System.out.println("Ok");
        		break;

        		default:
        		System.out.println("-1");
        	}

	}
}