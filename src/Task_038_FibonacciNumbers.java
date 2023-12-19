import java.util.Scanner;

public class Task_038_FibonacciNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the number of element for Fibonacci Numbers: ");
        int number=input.nextInt();

        String fibonacciNumbers="";
        int preNumber=0;
        int nextNumber=1;
        fibonacciNumbers=preNumber+" "+nextNumber;

        for (int i = 0; i <number-2 ; i++) {
            int sum=preNumber+nextNumber;
            preNumber=nextNumber;
            nextNumber=sum;
            fibonacciNumbers+=" "+sum;
        }

        System.out.println(fibonacciNumbers);

    }
}
