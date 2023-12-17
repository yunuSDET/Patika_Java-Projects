import java.util.Scanner;

public class Task_021_PowerOfNumbersWithFor {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();

        System.out.println("Enter the power of number: ");
        int power = input.nextInt();


        int result=1;

        for (int i = 1; i <=power ; i++) {
            result*=number;
        }

        System.out.println("The "+power+". power of "+number+" is "+result);

    }
}
