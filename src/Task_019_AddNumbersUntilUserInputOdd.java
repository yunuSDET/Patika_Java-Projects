import java.util.Scanner;

public class Task_019_AddNumbersUntilUserInputOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum=0;

        while (true){
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if(number % 2 !=0) break;
            if(number % 4 ==0) sum+=number;
        }

        System.out.println(sum);



    }
}
