public class ProfitLossCalculation{
    public static void main(String [] args){
	
	   //creating variables costPrice,sellingPrice and assigning values 
	   int costPrice=129 , sellingPrice=191;
	   
	   //creating profit and profitPercentage variables for assigning values 
	   int profit=sellingPrice-costPrice;
	   double profitPercentage=(double) profit/costPrice*100;
	   
	   //displaying result
	   System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR" +sellingPrice+"\n The Profit is INR"+profit+"and the Profit Percentage is"+profitPercentage);
	}
}