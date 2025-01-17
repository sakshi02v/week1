public class frequentCharacter {
    public static void main(String[] args) {
        String input="success";
        char result = mostFrequent(input);
        if(result !='\0'){
            System.out.println("Most frequent character is:"+result);
        }
        else{
            System.out.println("invalid");
        }
    }
    public static char mostFrequent(String str){
        int [] frequency=new int[256];
        int maxfrequency=0;
        char mostFrequent='\0';
        for(char c:str.toCharArray()) {
            frequency[c]++;
            if(frequency[c]>maxfrequency){
                maxfrequency=frequency[c];
            }
            mostFrequent=c;    
        }
    
        return mostFrequent;
}
        }
