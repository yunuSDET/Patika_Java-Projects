package ElevatorSimulation;

public class Elevator {
    private static int id=1;
    private int elevatorId;
    private double capacity;
    private String displayScreen;
    private boolean door;
    private int inWhichFloor;
    private boolean isAvailable;
    private ControlPanel controlPanel;
    private int calledFloor;

    public Elevator() {

        this.elevatorId=id++;
        this.capacity = 6;
        this.displayScreen = "Elevator is on the "+inWhichFloor+". floor.";
        this.door = false;
        this.inWhichFloor = 1;
        this.isAvailable = true;
        this.controlPanel = new ControlPanel();

    }

    public int getCalledFloor() {
        return calledFloor;
    }

    public void moveUp(){
        inWhichFloor++;
    }


    public void moveDown(){
        inWhichFloor--;
    }

    public void setCalledFloor(int calledFloor) {
        this.calledFloor = calledFloor;
    }

    public int getInWhichFloor() {
        return inWhichFloor;
    }

    public void pressTarget(int target){
        controlPanel.pressTargetBtn(target);
    }

    public void displayControlPanel(){
        System.out.println(controlPanel);
    }
}
