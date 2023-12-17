import java.util.Scanner;

public class Task_017_EvenNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number to list all even numbers up to that number: ");
        int number = input.nextInt();

        for (int i = 0; i <=number; i++) {
            if(i % 2 ==0) System.out.println(i+" is an eve number.");
        }
    }
}
