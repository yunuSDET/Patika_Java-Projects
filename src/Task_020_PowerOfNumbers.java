import java.util.Scanner;

public class Task_020_PowerOfNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();


        int power4=0;
        int power5=0;

       while (true){

           int actualPowerof4= (int) Math.pow(4,power4++);
           int actualPowerof5= (int) Math.pow(5,power5++);

            if(actualPowerof4<=number)  {
                System.out.println("4^"+(power4-1)+" = "+actualPowerof4);
            }

           if(actualPowerof5<=number)  {
               System.out.println("5^"+(power5-1)+" = "+actualPowerof5);
           }

           if(actualPowerof4>=number && actualPowerof5>=number) break;




       }


    }
}
