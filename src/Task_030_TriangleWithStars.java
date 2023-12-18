import java.util.Scanner;

public class Task_030_TriangleWithStars {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the row number :");
        int row=input.nextInt();

        int space=0;
        for (int i = row; i >0 ; i--) {
            System.out.println(" ".repeat(space++)+"*".repeat(i));
        }


    }
}
