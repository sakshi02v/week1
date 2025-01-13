import java.util.*;
public class DayofWeek{
   public static void main(String [] args){
   
   //sc object to read input
   Scanner sc=new Scanner(System.in);
   
   int m, d, y;
  
   System.out.println("Enter month (jan=1,feb=2,...):");
   m=sc.nextInt();
   
   System.out.println("Enter date :");
   d=sc.nextInt();
   
   System.out.println("Enter Year:");
   y=sc.nextInt();
   
  int y0=y-(14-m)/12;
  int x=y0+y0/4-y0/100+y0/400;
  int m0=m+12*((14-m)/12)-2;
  int d0=((d+x+31*m0)/12)%7;
  if(d0==1)
	System.out.println("Monday");
if(d0==2)
	System.out.println("Tuesday");
else if(d0==3)
	System.out.println("Wednesday");

else if(d0==4)
	System.out.println("Thursday");

else if(d0==5)
	System.out.println("Friday");

else if(d0==6)
	System.out.println("Saturday");

else
   System.out.println("Sunday");



  }
} 
  

   
   
   
   
   