class Bicycle  
{ 
  
 
  public int gear; 
  public int speed; 
          
   
  public Bicycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
 
    public String toString()  
    { 
      return("No of gears are       "+gear +"\n speed of bicycle is"+ speed); 
    }  
}
class MountainBike extends Bicycle   
{ 
  
   public int seatHeight;  
 
 
 
    public MountainBike(int gear,int speed, int startHeight) 
    { 
        super(gear, speed); 
        seatHeight = startHeight; 
    } 
 
    public String toString()  
    { 
      return (super.toString()+  "\nseat height is "+seatHeight);
    }  
} 


public class Test  
{     public static void main(String args[])  
    { 
        
        Bicycle mb2 = new MountainBike(4, 200, 20);  
        
        MountainBike mb1 = new MountainBike(3, 100, 25); 
          
        System.out.println("seat height of first bicycle is "  + mb1.seatHeight);  
        System.out.println(mb1.toString()); 
        System.out.println(mb2.toString()); 
  

     }
}
