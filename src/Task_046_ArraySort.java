import java.util.Arrays;
import java.util.Scanner;

public class Task_046_ArraySort {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=input.nextInt();
        int[] array=new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+". element: ");
            array[i]=input.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted array :"+Arrays.toString(array));


    }
}
