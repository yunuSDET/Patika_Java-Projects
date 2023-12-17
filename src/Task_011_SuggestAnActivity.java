public class Task_011_SuggestAnActivity {


    public static void main(String[] args) {

        double temperature=15;
        String  activity="";

        if(temperature<5){
            activity="Suggested activity is Skiing";
        }else if(temperature<=15){
            activity="Suggested activity is Going to Cinema";
        }else if(temperature<=25){
            activity="Suggested activity is Going to Picnic";
        }else{
            activity="Suggested activity is Swimming";
        }



    }
}
