// Invoking a method on null causes NullPointerException
import java.io.*;

class NullPointerExceptionDemo {

    public static void ExceptionHere(){
        // Initializing String variable with null value
        String s = null;

        // Checking if s.equals null
        try
        {
            // This line of code throws NullPointerException because s in null
           
            if (s.equals("abc"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
			}
	}		
    public static void main (String[] args) {
      ExceptionHere();
        
        
    }
}