import java.util.Scanner;

public class Task_028_MaxMinNumber {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("How many numbers do you enter: ");
        int number=input.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i <number; i++) {

            System.out.println("Enter "+(i+1)+". number: ");
            int actualNumber=input.nextInt();
            if(min>actualNumber) min=actualNumber;
            if(max<actualNumber) max=actualNumber;
        }

        System.out.println("Minimum number is :"+min);
        System.out.println("Maximum number is :"+max);


    }


}
