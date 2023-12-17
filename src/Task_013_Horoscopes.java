import java.time.LocalDate;
import java.util.*;

public class Task_013_Horoscopes {
    private List<LocalDate> horoscopeDate;
    private String horoscopeName;

    public Task_013_Horoscopes(String horoscopeName, LocalDate startingDate, LocalDate endingDate) {
        this.horoscopeDate = new ArrayList<>(Arrays.asList(startingDate,endingDate));
        this.horoscopeName = horoscopeName;
    }


    public static void main(String[] args) {


     List<Task_013_Horoscopes> horoscopes=new ArrayList<>();

     horoscopes.add(new Task_013_Horoscopes("Aries",LocalDate.of(0,3,21),LocalDate.of(0,4,20)));

        horoscopes.add(new Task_013_Horoscopes("Taurus",LocalDate.of(0,4,21),LocalDate.of(0,5,21)));

        horoscopes.add(new Task_013_Horoscopes("Gemini",LocalDate.of(0,5,22),LocalDate.of(0,6,22)));


        horoscopes.add(new Task_013_Horoscopes("Cancer",LocalDate.of(0,6,23),LocalDate.of(0,7,22)));


        horoscopes.add(new Task_013_Horoscopes("Leo",LocalDate.of(0,7,23),LocalDate.of(0,8,22)));

        horoscopes.add(new Task_013_Horoscopes("Virgo",LocalDate.of(0,8,23),LocalDate.of(0,9,22)));

        horoscopes.add(new Task_013_Horoscopes("Libra",LocalDate.of(0,9,23),LocalDate.of(0,10,22)));

        horoscopes.add(new Task_013_Horoscopes("Scorpio",LocalDate.of(0,10,23),LocalDate.of(0,11,21)));

        horoscopes.add(new Task_013_Horoscopes("Sagittarius",LocalDate.of(0,11,22),LocalDate.of(0,12,21)));

        horoscopes.add(new Task_013_Horoscopes("Capricorn",LocalDate.of(0,12,22),LocalDate.of(0,1,21)));

        horoscopes.add(new Task_013_Horoscopes("Aquarius",LocalDate.of(0,1,22),LocalDate.of(0,2,19)));

        horoscopes.add(new Task_013_Horoscopes("Pisces",LocalDate.of(0,2,20),LocalDate.of(0,3,20)));


        Scanner input =new Scanner(System.in);
        System.out.println("How many is the order number of the month you were born in?");
        int month =input.nextInt();
        System.out.println("What day of the month were you born?");
        int day =input.nextInt();

        LocalDate date=LocalDate.of(0,month,day);

        horoscopes.stream()
                .filter(i -> date.isAfter(i.horoscopeDate.get(0)) && date.isBefore(i.horoscopeDate.get(1)))
                .forEach(matchedHoroscope -> System.out.println("Your horoscope is: " + matchedHoroscope.horoscopeName));


    }
}
