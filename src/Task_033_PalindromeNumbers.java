import java.util.Scanner;

public class Task_033_PalindromeNumbers {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println(isPalindrome(number) ? number +" is palindrome. ":number+" is not palindrome.");


    }


    public static boolean isPalindrome(int number){

        String numberStr=String.valueOf(number);
        String reversedNumberStr=new StringBuilder(numberStr).reverse().toString();



        return numberStr.equals(reversedNumberStr);
    }
}
