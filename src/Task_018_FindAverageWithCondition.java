import java.util.Scanner;

public class Task_018_FindAverageWithCondition {

    public static void main(String[] args) {

        double sum=0;
        int counter=0;

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number to find the average of all numbers (divisible by 3 and 4) up to that number: ");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if(i % 3 ==0 && i % 4 ==0){
                sum+=i;
                counter++;
            }
        }

        System.out.println("The average of numbers is: "+(sum/counter));



    }
}
