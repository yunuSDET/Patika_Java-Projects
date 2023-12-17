public class Task_016_LeapYear {

    public static void main(String[] args) {

        for (int i = 0; i < 2100; i++) {
            if(isLeapYear(i)){
                System.out.println("The year of "+i+" is a leap year");
            }else{
                System.out.println("The year of "+i+" is not  a leap year");
            }
        }


    }


    public static boolean isLeapYear(int year){

        if(!(year % 4 == 0)) return false;

        if(year % 100 ==0 && year % 400 !=0) return false;

        return true;
    }
}
