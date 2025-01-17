public class substring {
    public static void main(String[] args) {
        String string = "hello world, hello universe";
        String substring = "hello";

        int count = (string.length() - string.replace(substring, "").length()) / substring.length();
        System.out.println("The substring '" + substring + "' appears " + count + " times in the string.");
    }
}
