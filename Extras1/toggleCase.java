public class toggleCase {
    public static void main(String [] args){
        String input="aBcD";
        String toggled=toggledCase(input);
        System.out.println("Original String:"+input);
        System.out.println("Toggled Case:"+toggled);
    }
    public static String toggledCase(String str){
        StringBuilder result=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }
            else{
                result.append(ch);
            }
        }
      return result.toString();
    }
}
