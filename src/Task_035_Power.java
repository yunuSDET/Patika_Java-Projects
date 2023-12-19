public class Task_035_Power {

    public static void main(String[] args) {

        System.out.println(power(3,4));


    }

    public static int power(double number,double power){

        if(power==0) return 1;

        return (int) (number * power(number, --power));

    }
}
