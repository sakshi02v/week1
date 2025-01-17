import java.util.*;
import java.io.*;

class StringIndexOutofBoundDemo {

    public static void ExceptionHere(String text ,int index){
        
		try{
		char result=text.charAt(index);
		System.out.println(result);
		}
		
		catch(StringIndexOutOfBoundsException e){
		System.out.println("StrinIndexOutOfBoundsException caught");
		}
	}
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String text=sc.next();
	System.out.println("Enter index :");
	int index=sc.nextInt();
    ExceptionHere(text,index);

    }	
}