import java.util.Scanner;

public class Task_032_CreateSeries {


    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        System.out.println("Enter the value of firstNumber: ");
        int firstNumber =input.nextInt();

        System.out.println("Enter the value of secondNumber: ");
        int secondNumber =input.nextInt();

        System.out.println("Enter the number of items: ");
        int numberOfItems =input.nextInt();

        String result="";

        for (int i = 0; i < numberOfItems; i++) {
            result+=" "+(firstNumber+Math.pow(2,i)*secondNumber);
            System.out.print(result+" ");
        }
        System.out.println();



    }
}
