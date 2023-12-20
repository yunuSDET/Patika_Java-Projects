package ElevatorSimulation;

import java.util.*;

public class Building {
   private int floor=8;
   private String name;
   private List<Boolean> doors;
   private List<Boolean> bells;
   private Map<Integer,Map<String ,Boolean>> callButtons;
   private Signal signal;
  private List<Elevator> elevators ;


   public Map<Integer, Map<String, Boolean>> getCallButtons() {
      return callButtons;
   }


    public List<Elevator> getElevators() {
        return elevators;
    }

    public Building(String name) {
      this.elevators= new ArrayList<>(Arrays.asList(new Elevator(), new Elevator(), new Elevator(), new Elevator(), new Elevator()));
      this.name = name;
      this.doors = new ArrayList<>();
      this.bells = new ArrayList<>();
      setCallButtons();
      this.signal = new Signal();
   }



   private void setCallButtons(){
      this.callButtons =new HashMap<>();
      for (int i = 1; i <= floor; i++) {

         Map<String ,Boolean> buttons=new HashMap<>();
         buttons.put("Up",false);
         buttons.put("Down",false);
         buttons.put("Undefined",false);
         callButtons.put(i,buttons);

      }
   }




}
