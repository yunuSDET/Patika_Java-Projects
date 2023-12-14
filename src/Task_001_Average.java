import java.util.Scanner;

public class Task_001_Average {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double sum =0;


        String[] lessons = {"Turkish","Math","Physics","Chemistry","History","Music"};

        for (String eachLesson : lessons) {
            System.out.println("Enter your "+eachLesson+" exam score: ");
            sum+= input.nextInt();
        }

        System.out.println("The average of exam scores is "+(sum/lessons.length));



    }
}
