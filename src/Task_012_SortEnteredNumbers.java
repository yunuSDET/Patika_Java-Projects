import java.util.Arrays;
import java.util.Scanner;

public class Task_012_SortEnteredNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        //First solution
        int[] numbers =new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input "+(i+1) +". number: ");
            numbers[i]=input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("The sorted numbers :"+Arrays.toString(numbers));



        //Second solution
        System.out.println("Input 1. number: ");
        int n1=input.nextInt();
        System.out.println("Input 2. number: ");
        int n2=input.nextInt();
        System.out.println("Input 3. number: ");
        int n3=input.nextInt();

        String sortedNumbers="";
        if(n1<=n2 && n1<=n3){
            if(n2<n3){
              sortedNumbers=n1+", "+n2+", "+n3;
            }else{
                sortedNumbers=n1+", "+n3+", "+n2;
            }
        }else if(n2<=n1 && n2<=n3){
            if(n1<n3){
                sortedNumbers=n2+", "+n1+", "+n3;
            }else{
                sortedNumbers=n2+", "+n3+", "+n1;
            }
        }else{
            if(n1<n2){
                sortedNumbers=n3+", "+n1+", "+n2;
            }else{
                sortedNumbers=n3+", "+n2+", "+n1;
            }
        }
        System.out.println("Sorted numbers are: "+sortedNumbers);


    }
}
