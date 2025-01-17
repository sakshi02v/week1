import java.util.Scanner;

public class ArrayIndexExDemo{
 
    public static void Exceptionhere(String [] names,int length, int index) {
	String target=names[index];
	System.out.println("Accessed name: " + target);
	}
	
	public static void HandleException(String [] names,int length,int index){
	try{
	Exceptionhere(names,length,index);
	}
	catch( ArrayIndexOutOfBoundsException e){
	System.out.println("ArrayIndexOutOfBoundsException caught");
	} 
	catch(RuntimeException e){
	System.out.println("RuntimeExceptionException caught");
	}
}

    public static void main(String [] args){
	
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of array");
    int length=sc.nextInt();

    String [] names=new String[length];

    System.out.println("Enter index of array");
    int index=sc.nextInt();

    System.out.println("Enter names:");
    for(int i=0;i < names.length;i++){
    names[i]=sc.next();
}

    try{
    Exceptionhere(names,length,index);
    }

    catch(Exception e){
    HandleException(names,length,index);
     }
   }
}
