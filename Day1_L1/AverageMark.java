public class AverageMark{
    public static void main(String [] args){
		
	    //creating integer variables  maths, phy, chem and assigning marks
        int maths=94,phy=94,chem=96; 
		
		//creating avg variable of double type for storing average marks by explicit conversion
        double avg=(double)(maths+phy+chem)/3;
		
        //displaying result
        System.out.println(" Sam ’s average mark in PCM is:"+avg);
    }
}