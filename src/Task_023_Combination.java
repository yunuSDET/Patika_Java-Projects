import java.util.Scanner;

public class Task_023_Combination {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter total item number for calculating combination: ");
        int itemNumber = input.nextInt();

        System.out.println("Enter the number of groups for calculating combination: ");
        int groupNumber=input.nextInt();

        int factorial = factorial(itemNumber)/
                (factorial(groupNumber)*factorial((itemNumber-groupNumber)));

        System.out.println("Result is :"+factorial);



    }


    public static int factorial(int number){
        if(number==0) return 1;
        int result=1;
        for (int i = 1; i <=number ; i++) {
            result*=i;
        }
        return result;
    }
}
