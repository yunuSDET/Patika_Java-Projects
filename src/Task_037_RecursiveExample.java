public class Task_037_RecursiveExample {

    public static void main(String[] args) {

        plusMinus5(16,16,true);

    }


    public static void plusMinus5(int number,int n, boolean isDown){

        System.out.print(n + " ");

        if (n > 0 && isDown) {
            plusMinus5(number, n - 5, true);
        } else if (n < number) {
            plusMinus5(number, n + 5, false);
        }

    }



}
