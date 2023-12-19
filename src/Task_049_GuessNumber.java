import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_049_GuessNumber {


    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);

        int guess;

        boolean quit=false;
        int right=5;

        System.out.println("Guess the number: ");
        guess =input.nextInt();

        while (!quit){

            if(right==0){
                System.out.println("You couldn't find the number in 5 tries");
                break;
            };


            if(guess<number){
                System.out.println("Increase your number: ");
                guess =input.nextInt();
            }else if(guess>number){
                System.out.println("Decrease your number: ");
                guess =input.nextInt();
            }else{
                System.out.println("You found the number!");
                quit=true;
            }

            right--;
        }






    }


}
