import java.util.Scanner;

public class HarmonicNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        double sum=0;

        for (int i = 1; i <= number; i++) {
            sum+=1/(double)i;
        }

        System.out.println("Result is "+sum);

    }
}
