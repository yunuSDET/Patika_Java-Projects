package ElevatorSimulation;

import java.util.Random;

public class User {

    private  static int id=1;
    private int userId;
    private int inWhichFloor;
    private int targetFloor;
    Random random=new Random();


    public User() {
        userId = id++;
        setFloors();
    }


    public void setFloors(){
        while (true){
            setTargetFloor();
            setInWhichFloor();
            if(getInWhichFloor()!=getTargetFloor()) break;
        }
    }

    public String  getId() {
        return "User"+id;
    }

    public int getInWhichFloor() {
        return inWhichFloor;
    }

    public void setInWhichFloor() {
        this.inWhichFloor = random.nextInt(1,9);
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public void setTargetFloor() {
        this.targetFloor =random.nextInt(1,9);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", inWhichFloor=" + inWhichFloor +
                ", targetFloor=" + targetFloor +
                '}';
    }
}
