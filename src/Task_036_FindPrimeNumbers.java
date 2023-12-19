import java.util.Scanner;

public class Task_036_FindPrimeNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);


        System.out.println("Enter a number: ");
        int number=input.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime number.");
        } else {
            if (isPrime(number, number / 2)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }


    }

    public static boolean isPrime(int sayi, int i) {
        if (i == 1) {
            return true;
        } else {
            if (sayi % i == 0) {
                return false;
            } else {
                return isPrime(sayi, i - 1);
            }
        }
    }


}
