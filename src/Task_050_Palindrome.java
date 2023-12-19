public class Task_050_Palindrome {

    public static void main(String[] args) {


        System.out.println(isPalindrome("star"));


    }

    public static boolean isPalindrome(String str){

        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

    }
}
