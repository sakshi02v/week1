import java.util.*;


class toLowerCaseString{
 
 
  public static String convertToLower(String s ){
     String ans = "";
    for(int i = 0 ; i<s.length() ;i++){
	 if((int)s.charAt(i)>=65){
	   int x = (int)s.charAt(i)+32 ;
	   ans+=(char)x;
	 }else{
	   ans+=s.charAt(i);
	 }
	}
	
	return ans;
  }
  
  public static boolean compareString(String s1 , String s2 ){
    boolean ans = true;
	
	if(s1.length()!=s2.length()){
	  return false;
	}
	for(int i = 0 ; i<s1.length() ; i++){
	  if(s1.charAt(i)!=s2.charAt(i)){
	  ans = false;
	  }
	}
  return ans;
  }

  public static void main(String args[]){
   
    Scanner sc = new Scanner(System.in);
	System.out.println("enter the string: ");
	
	String str = sc.nextLine();
	
	String ust1 = str.toLowerCase();
	System.out.println(ust1);
	 String  ust2 = convertToLower(str);
	 System.out.
	 println(ust2);
	 
	 if(compareString(ust1,ust2)){
	 System.out.println("both  string are same");
	 }
	 else{
	 	 System.out.println("both string are not same");

	 }
	 
   
  }

}