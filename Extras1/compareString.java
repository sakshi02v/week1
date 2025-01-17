
import java.util.Scanner;

public class compareString {
    public static int Comparison(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int minLength=Math.min(len1,len2);
        for(int i=0;i<minLength;i++){
            char c1= str1.charAt(i);
            char c2=str2.charAt(i);
            if(c1 != c2){
                return c1-c2;
            }
        }
        return len1-len2;
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First String:");
    String str1=sc.next();
    System.out.println("Enter Second String");
    String str2=sc.next();
    int result=Comparison(str1, str2);
if(result < 0){
    System.out.println(str1+" comes before "+str2);}
    else if(result > 0){
        System.out.println(str2+" comes before "+str1);
    }
    else{
        System.out.println("Both strings are equal");
    }
}
}   

