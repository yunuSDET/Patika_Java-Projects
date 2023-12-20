package ElevatorSimulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    Building building=new Building("Our Builging");




    public static void main(String[] args) {


    }

    public void startScenario(int numberOfUser){

    }

    public void userScenario(User user){

        int activeFloor=user.getInWhichFloor();
        int targetFloor= user.getTargetFloor();
        String direction = activeFloor<targetFloor ? "Up":"Down";
        pressCallBtn(activeFloor,direction);
        System.out.println(user.getId()+" is on the "+activeFloor+" and press the call button.");


    }


    public void pressCallBtn(int activeFloor,String direction){
        building.getCallButtons().get(activeFloor).put(direction,true);

    }


    public void callElevator(int activeFloor,String direction){
        for (Elevator eachElevator : building.getElevators()) {
            if(direction.equals("Up")){
                if(eachElevator.getInWhichFloor()<=activeFloor){
                    eachElevator.setCalledFloor(activeFloor);
                }
            }
        }
    }


}
