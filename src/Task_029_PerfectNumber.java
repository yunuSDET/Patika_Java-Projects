import java.util.Scanner;

public class Task_029_PerfectNumber {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println(isPerfect(number) ? number +" is a perfect number.":number+" is not a perfect number.");



    }

    public static boolean isPerfect(int number){

        int sum=0;

        for (int i = 1; i <number ; i++) {
            if(number % i ==0) sum+=i;
        }

        return number==sum;
    }

}
