public class RemoveCharacter {
    public static String charRemove(String str, char remove){
     StringBuilder result=new StringBuilder();
     for (char ch:str.toCharArray()) {
     if(ch != remove)   {
        result.append(ch);
     }      
     } 
     return result.toString();
}
 public static void main(String[] args) {
    String input="Hello World";
    char remove='o';
    String result=charRemove(input, remove);
    System.out.println("String after removal of "+remove+" is:"+result);
 }   
}
