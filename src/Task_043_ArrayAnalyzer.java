import java.util.Scanner;

public class Task_043_ArrayAnalyzer {

    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int smallMax=Integer.MIN_VALUE;
        int bigMin=Integer.MAX_VALUE;

        for (int each : list) {

            if(each<number){
                if(smallMax<each) smallMax=each;
            }else if(each>number){
                if(bigMin>each) bigMin=each;
            }


        }

        String resultSmallMax=smallMax==Integer.MIN_VALUE ? "Entered number is the smallest number.":"The largest number smaller than the entered number is "+smallMax;

        String resultBigMin=bigMin==Integer.MAX_VALUE ? "Entered number is the largest number.":"The smallest number larger than the entered number is "+bigMin;


        System.out.println(resultSmallMax);
        System.out.println(resultBigMin);


    }
}
