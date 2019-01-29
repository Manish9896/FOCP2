import java.util.*;
class array
{
	
		public static void main(String args[])
		{
          int i;
          Scanner n1 = new Scanner(System.in);
          System.out.println("Enter the size of array");
          int size = n1.nextInt();
          int array[] = new int[size];
          System.out.println("Enter the array elements");
          for(i=0;i<size;i++)
          {
          	array[i]= n1.nextInt();

          }

          System.out.println("The entered array is ");
          for(i=0;i<size;i++)
          {
          	System.out.println(array[i]);
          }

          int temp;

          for(i=0;i<size;i++)
          {
          	
          	if(array[i]==0)
          	{
          		temp=array[i];
          		array[i]=array[size-1];
          		array[size-1]=temp;
          		size--;
          	}

          	
          }

          System.out.println("The sorted array is ");
          for(i=0;i<size;i++)
          {
          	System.out.println(array[i]);
          }

          
		}

	
}