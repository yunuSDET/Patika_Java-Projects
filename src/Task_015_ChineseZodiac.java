import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task_015_ChineseZodiac {

    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("In which your were your born?");
        int year= input.nextInt();

        List<String> zodiac = new ArrayList<>(Arrays.asList(
                "Monkey",
                "Rooster",
                "Dog",
                "Pig",
                "Rat",
                "Ox",
                "Tiger",
                "Rabbit",
                "Dragon",
                "Snake",
                "Horse",
                "Sheep"));


        System.out.println("Your Chinese Zodiac Sign: "+zodiac.get(year % 12));





    }
}
