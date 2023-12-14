import java.util.Scanner;

public class Task_010_PassingScore {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double sum =0;
        int counter =0;

        String[] lessons = {"Turkish","Math","Physics","Chemistry","Music"};

        for (String eachLesson : lessons) {
            System.out.print("Enter your "+eachLesson+" exam score: ");
            double eachScore =input.nextDouble();
            if(eachScore>=0 && eachScore<=100){
                sum+= eachScore;
                counter++;
            }

        }

        double average = sum/counter;

        String result = average>=55 ? "Congratulations, you passed the class.":"'m sorry, you did not pass the class.";

        System.out.println(result);

    }
}
